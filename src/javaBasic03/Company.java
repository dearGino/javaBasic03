package javaBasic03;
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
	private Date founded;
	private List<Security> securities = new ArrayList<Security>();
	
	
	public void printChosenCurrency(String input) {
		List <Security> chosenCurrency = securities.stream()
				.filter(x -> (x.getCurrency().contains(input))).toList();

		for (Security s : chosenCurrency)
		{
			System.out.println ();
			System.out.println ("Компания " + name + ",  id = " + id);
		    System.out.println ("владеет бумагами в валюте " + input +":");
		    System.out.println("  компании  " + s.getName());
		    System.out.println("  " + s.getCurrency());
		    System.out.println("  код:  " + s.getCode());
		}
	}
	
	public int printExpiredSecurities() {
		LocalDate inputDate = LocalDate.now(); 
		
		List <Security> expired = securities.stream()
				.filter(x -> ((ChronoLocalDate) x.getDate()).isBefore(inputDate)).toList();

				
		for (Security s : expired)
		{
			System.out.println ();
			System.out.println (s.getName()+":");
		    System.out.println("Код: "+s.getCode());
		    System.out.println("Дата: "+s.toPrintDate());
		}
		return (expired.size());
	}
	
	
	public void printFoundationDate() {
		System.out.println(name +"   -     дата основания " + founded.printDate());
	}
	
//	public void printAll() {
//		
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(address);
//		System.out.println(phoneNumber);
//		System.out.println(inn);
//		founded.printing();
//		for (Security iii : securities)
//		{
//		    iii.printing();
//		}
//	}
	
	public List<Security> getSecurities() {
		return securities;
	}
	

	

	public String getName() {
		return name;
	}


	public LocalDate getFounded() {
		return founded.getDate();
	}
	public String toPrintFounded() {
		return founded.printDate();
	}


}
