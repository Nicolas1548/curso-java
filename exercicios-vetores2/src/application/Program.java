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

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vetor[i];
		}

		double media = soma / n;

		System.out.print("Valores =");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f  ", vetor[i]);
		}
		
		System.out.printf("Soma = %.2f ", soma);
		System.out.printf("Media = %.2f ", media);

		sc.close();
	}

}
