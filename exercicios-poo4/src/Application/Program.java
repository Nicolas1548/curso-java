package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {
	public static void main() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		CurrencyConverter converter = new CurrencyConverter();
		System.out.println("What is the dollar price? ");
		converter.dollar = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		converter.dollarNeed = sc.nextDouble();

		System.out.printf("Amount to be paid in reais = %.2f%n", converter.Result());

		sc.close();
	}

}
