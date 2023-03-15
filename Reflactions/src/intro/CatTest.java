package intro;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.text.DecimalFormat;

public class CatTest {

	public static void main(String[] args) throws Exception {
		Cat myCat = new Cat("Hansi", 4);
		
		if(myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
			
			VeryImportant vi = myCat.getClass().getAnnotation(VeryImportant.class);
			
			for(int i = 0; i < vi.times(); i++) {
				System.out.println("Very Importans");
			}
			double d = 1234567.89;    
			int i = 123;
			System.out.println(new DecimalFormat(vi.format()).format(i));
			
			
			for(Field f : myCat.getClass().getDeclaredFields()) {
				if(f.isAnnotationPresent(ImportantString.class)) {
					f.setAccessible(true);
					System.out.println("Important String "+ f.get(myCat));
				}
			}
			
		}

		
		
		System.out.println("Ende");
	}

}
