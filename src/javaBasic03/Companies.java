package javaBasic03;

import java.util.ArrayList;
import java.util.List;

public class Companies {
	public List<Company> companies = new ArrayList<>();
	
	public void printAll() {
		for (Company c : companies)
		{
		    c.printAll();
		}
	}
	public void printFoundationDate() {
		for (Company c : companies)
		{
		    c.printFoundationDate();
		}
	}
	
	public void printExpiredSecurities() {
		for (Company c : companies)
		{
		    c.printExpiredSecurities();
		}
	}
	
	public void printFoundedAfterDate(String input) {
		for (Company c : companies)
		{
		  //  c.printFoundedAfterDate(input);
		}
	}
}
