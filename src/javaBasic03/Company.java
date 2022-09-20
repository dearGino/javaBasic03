package javaBasic03;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

public class Company {
	private int id;
	private String name;
	private String address;
	private String phoneNumber;
	private String inn;
	private MyDate founded;
	private List<Security> securities = new ArrayList<Security>();
	
	public void printAll() {
	
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		System.out.println(phoneNumber);
		System.out.println(inn);
		founded.printing();
		for (Security iii : securities)
		{
		    iii.printing();
		}
		
	}

	public void printFoundationDate() {
		System.out.print(name +"   -     дата основания ");
		founded.printing();
	}
	
	

	public List<Security> getSecurities() {
		return securities;
	}
	
	public void printExpiredSecurities() {
		LocalDate inputDate = LocalDate.now(); 
		List <Security> expired = securities.stream()
				.filter(x -> ((ChronoLocalDate) x.getDate()).isBefore(inputDate)).toList();
		for (Security s : expired)
		{
			System.out.println (s.getName()+":");
		    System.out.println("Код: "+s.getCode());
		    System.out.println("Дата: "+s.toPrintDate());
		}
	}
	
	public void printFoundedAfterDate(String input) {
		//MyDate newDate = new MyDate (input);
//		Date inputDate = new Date (input);
//		List <Security> expired = securities.stream()
//				.filter(x -> ((ChronoLocalDate) x.getDate()).isBefore(inputDate.getDate())).toList();
//		
		
		
	}
}
