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
		System.out.println("=========Все компании и даты их основания =========");
		//iRead.printFoundationDate();
		
		System.out.println("=========Все ценные бумаги ==================");
		//iRead.printAllSecurities();
		
		System.out.println("=========Организации основанные после даты ==================");
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        String inputDate = input.nextLine();
		iRead.printFoundedAfterDate(inputDate);
	}

}
