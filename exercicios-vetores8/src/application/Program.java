package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();

		int[] vetor = new int[n];
		double mediaPares = 0;
		double calculo = 0;
		int numeroPares = 0;

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite um numero:");
			vetor[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				mediaPares += vetor[i];
				numeroPares++;
			}
		}

		if (numeroPares > 0) {
			calculo = mediaPares / numeroPares;
			System.out.printf("MEDIA DOS PARES = %.1f", calculo);
		} else {
			System.out.print("NENHUM NUMERO PAR");
		}

		sc.close();
	}

}
