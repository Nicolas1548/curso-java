package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		System.out.print("\nNUMEROS PARES:");
		int pares = 0;
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d  ", vetor[i]);
				pares++;
			}
		}

		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", pares);

		sc.close();
	}

}
