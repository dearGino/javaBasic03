package javaBasic03;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws Throwable {

		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
		File file = new File("src/javaBasic03/companies.json");  
		Companies iRead = objectMapper.readValue(file, new TypeReference<>(){});
		//iRead.printAll();
		//1.
		System.out.println("=========Все компании и даты их основания ================");
		System.out.println();
		iRead.printFoundationDate();
		System.out.println();
		//2.
		System.out.println("=========Все просроченные ценные бумаги ==================");
		System.out.println("               на сегодняшний день");
		iRead.printExpiredSecurities();
		System.out.println();
		//3.
		System.out.println("=========Организации основанные после выбранной даты =====");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите дату: ");
		String input = scanner.nextLine();
		Date inputDate = new Date(input);
		iRead.printFoundedAfterDate(inputDate.getDate());
		System.out.println();
		//4.
		System.out.println("=========Все ценные бумаги по виду валюты ================");
		System.out.print("Введите валюту (RUB, USD, EU): ");
		input = scanner.nextLine();
		iRead.printChosenCurrency(input);
	}

}
