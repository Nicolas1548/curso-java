package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employe;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employe employe;

		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		List<Employe> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("");
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			employe = new Employe(id, name, salary);
			list.add(employe);
		}

		System.out.print("Enter the employee id that will have salary increase: ");
		Integer id = sc.nextInt();

		Employe emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This id does not exist!\n");
		} else {
			System.out.print("Enter the percentage: ");
			double porcentagem = sc.nextDouble();
			emp.aumentoSalario(porcentagem);
		}

		System.out.println("List of employees: ");
		for (Employe x : list) {
			System.out.println(x);
		}

		sc.close();

	}

	public static boolean hasId(List<Employe> list, int id) {
		Employe emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
