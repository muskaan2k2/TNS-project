package com.tnsif.daythree;
import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=ob.next();
		
		System.out.println("Enter the age of the person");
		int age=ob.nextInt();
		
		System.out.println("Enter the gender");
		String gender=ob.next();
		
		System.out.println("Enter the income");
		int income=ob.nextInt();
		
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		System.out.println(person); 
		
		TaxCalculation calc=new TaxCalculation();
		calc.calculateTax(person);
		
		System.out.println("After Tax Calculation");
		System.out.println(person);
		
		ob.close();

	}

}
