package Pirat;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CsvWriter<T>{
	Class<T> type;
	Writer writer;
	char del = ';';
	
	public CsvWriter(Class<T> type, Writer w) {
		this.type = type;
		this.writer = w;
	}
	
	void writeObject(T obj) throws IOException, RuntimeException, IllegalAccessException {
		if(this.type.isAnnotationPresent(Csv.class)) {
			List<String> values = new ArrayList<>();
			for (Field f : this.type.getDeclaredFields()) {
				if(f.isAnnotationPresent(CsvColumn.class)) {
					CsvColumn csvCol = f.getAnnotation(CsvColumn.class);
					if(!csvCol.format().equals("")) {
						values.add(new DecimalFormat(csvCol.format()).format(f.get(obj)));
					}else {
						values.add(f.get(obj)+"");
					}
				}
			}
			writer.write(String.join(""+this.del, values) + "\n");
		}
	}
	
	void write(Iterable<? extends T> it) throws IOException, IllegalAccessException, RuntimeException {
		List<String> value = new ArrayList<>();
		if(this.type.isAnnotationPresent(Csv.class)) {
			for (Field f : this.type.getDeclaredFields()) {
				if(f.isAnnotationPresent(CsvColumn.class)) {
					value.add(f.getName());
				}
			}
			writer.write(String.join(""+this.del, value) + "\n");
		}
		
		for (Iterator<? extends T> iter = it.iterator(); iter.hasNext();) {
			writeObject((T) iter.next());
		}

//		for (T t : it) {
//			writeObject(t);
//		}
	}
	
	CsvWriter<T> delimiter(char c) {
		this.del = c;
		return this;
	}
}
