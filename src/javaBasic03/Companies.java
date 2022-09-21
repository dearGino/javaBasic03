package javaBasic03;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

public class Companies {
	public List<Company> companies = new ArrayList<>();
	
//	public void printAll() {
//		for (Company c : companies)
//		{
//		    c.printAll();
//		}
//	}
	public void printFoundationDate() {
		for (Company c : companies)
		{
		    c.printFoundationDate();
		}

	}
	
	public void printExpiredSecurities() {
		int count = 0;
		for (Company c : companies)
		{
		    count += c.printExpiredSecurities();
		}
		
		System.out.println("\nКоличество просроченных бумаг: " + count);
	}
	
	public void printFoundedAfterDate(LocalDate inputDate) {
		List <Company> foundedAfter = companies.stream()
				.filter(x -> ((ChronoLocalDate) x.getFounded()).isAfter(inputDate)).toList();
		for (Company s : foundedAfter)
		{
			System.out.println ("  ");
			System.out.println (s.getName()+":");
		    System.out.println("Дата основания: "+s.toPrintFounded());
		}
	}
	
	public void printChosenCurrency(String input) throws Exception {
		if((input.equals("EU")) || (input.equals("RUB")) || (input.equals("USD"))){
			for (Company c : companies)
			{
			    c.printChosenCurrency(input);
			}
		} else {
		    throw new Exception("Ошибка: неверно введена валюта - " + input);
		}

	}
}
