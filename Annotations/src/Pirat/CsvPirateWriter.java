package Pirat;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;



public class CsvPirateWriter {
	public static void main( String[] args ) {
	    Pirate p1 = new Pirate();
	    p1.name = "Hotzenplotz";
	    p1.profession = null;
	    p1.height = 192;
	    p1.income = 124234.3234;
	    p1.weight = 89.10;
	    p1.secrets = "kinky";
	    
	    List<Pirate> pirates = new ArrayList<>();
	    pirates.add(p1);
	    pirates.add(p1);
	    pirates.add(p1);
	    pirates.add(p1);

	    StringWriter writer = new StringWriter();
	    
	   
	    CsvWriter<Pirate> csvWriter = new CsvWriter<>( Pirate.class, writer );
	    try {
//			csvWriter.writeObject( p1 );
			csvWriter.write( pirates );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    System.out.println( writer );
	  }
	}