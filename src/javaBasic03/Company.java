package javaBasic03;

import java.text.ParseException;
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
		System.out.print(name + "   -   дата основания ");
		founded.printing();
	}
	
	

	public List<Security> getSecurities() {
		return securities;
	}
	
	public void printExpiredSecurities() {
		List <Security> expired = securities.stream()
				.filter(d -> d.compareTo())
		for (Security s : securities)
		{
			System.out.println (s.getName()+":");
		    System.out.println("Код: "+s.getCode());
		    System.out.println("Дата: "+s.toPrintDate());
		}
	}
	
	public void printFoundedAfterDate(String input) throws ParseException {
		Date newDate = new Date (input);
		
		
	}
}
