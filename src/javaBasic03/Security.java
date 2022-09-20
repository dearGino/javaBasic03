package javaBasic03;

import java.util.ArrayList;

public class Security {
	private String name;
	private ArrayList<String> currency;
	private String code;
	private Date date;
	
	public void printing() {
		
		System.out.println(name);
		for (String iii : currency)
		{
		    System.out.println(iii);
		}
		System.out.println(code);
		date.printing();
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getCurrency() {
		return currency;
	}

	public String getCode() {
		return code;
	}

	public Date getDate() {
		return date;
	}
	public String toPrintDate() {
		return date.printDate();
	}
}
