package application;
import java.util.Scanner;

import entities.Employer;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employer employee = new Employer();
		System.out.println("Enter employee name: ");
		employee.name = sc.next();
		System.out.println("Enter your Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Enter your tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("EMPLOYEE: " + employee.name + ", $" + employee.NetSalary());
		
		System.out.println("Which the porcentage to increase salary? ");
		employee.p = sc.nextDouble();
		
		System.out.printf("Updated data: %s, $ %.2f %n", employee.name, employee.IncreaseSalary());
		
	}

}
