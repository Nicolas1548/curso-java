package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];
		double maiorValor = 0;
		int posicao = -1;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero:");
			vetor[i] = sc.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			if (maiorValor < vetor[i]) {
				maiorValor = vetor[i];
				posicao = i;
			}
		}

		System.out.printf("\nMAIOR VALOR = %.2f", maiorValor);
		System.out.printf("\nPOSICAO DO MAIOR VALOR = %d", posicao);

		sc.close();
	}

}
