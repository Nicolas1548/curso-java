package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emplo = new Employee();
		
		System.out.print("Name: ");
		emplo.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		emplo.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emplo.tax = sc.nextDouble();
		
		System.out.println(emplo);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emplo.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + emplo);
		
		sc.close();
	}

}
