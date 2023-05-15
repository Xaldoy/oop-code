package hr.fer.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Parser {
	
	public static Reading parseInputString(String input) throws ParseReadingException {
        if(input.contains("{")) {
            input = input.replace("{", "");            
            input = input.replace("}", "");
            
            String[] data = input.split(", ");
            
            if(data.length != 3) throw new IncorrectArgumentNumberException();
            
            try {
                Integer serialNumber = Integer.parseInt(data[0].split(": ")[1]);
                Double readingValue = Double.parseDouble(data[2].split(" : ")[1]);
                LocalDate timestamp = parseDateForManufacturerA(data[1].split(" : ")[1]);
                
                return new Reading(serialNumber, readingValue, timestamp);
            }catch(NumberFormatException e) {
                throw new ReadingFormatException(e);
            }
            
        }else {
            String[] data = input.split(";");
            
            if(data.length != 3) throw new IncorrectArgumentNumberException();
            
            try {
                Integer serialNumber = Integer.parseInt(data[0]);
                Double readingValue = Double.parseDouble(data[2]);
                LocalDate timestamp = parseDateForManufacturerB(data[1]);
                
                return new Reading(serialNumber, readingValue, timestamp);
            }catch(NumberFormatException e) {
                throw new ReadingFormatException(e);
            }
        }
        
    }
	
	private static LocalDate parseDateForManufacturerA (String dateA) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		dtf = dtf.withLocale( Locale.GERMAN );
		LocalDate date = LocalDate.parse(dateA, dtf);
		
		return date;
	}
	
	private static LocalDate parseDateForManufacturerB (String dateB) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM dd yyyy");
		dtf = dtf.withLocale( Locale.GERMAN );
		LocalDate date = LocalDate.parse(dateB, dtf);
		
		return date;
	}

}
