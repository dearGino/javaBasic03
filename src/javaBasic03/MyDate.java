package javaBasic03;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MyDate {
	
	private LocalDate date;
	
	public MyDate (String inputDate) throws ParseException {
		try {
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
			date = LocalDate.parse(inputDate, df);
			
		}
		catch (DateTimeParseException exc) {
		    System.out.println("Ошибка: во входном файле неверный формат даты - " + inputDate);
		    throw exc;
		}
		
	}
	
	
	public LocalDate getDate() {
		return date;
	}


	public void printing() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println(df.format(date));
	}
	
	public String printDate() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		return df.format(date);
	}
	
}
