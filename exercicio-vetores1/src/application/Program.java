package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		if (n > 10) {
			System.out.println("O numero e no maximo até 10!!!");
		}
		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		System.out.println("NUMERO NEGATIVOS: ");

		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.printf("%d\n", vect[i] );
			}
		}
		sc.close();
	}

}
