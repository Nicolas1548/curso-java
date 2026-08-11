package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		double mediaVetor = 0;
		double calculo = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			calculo += vetor[i];
		}
		mediaVetor = calculo / n;

		System.out.printf("MEDIA DO VETOR = %.3f", mediaVetor);

		System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < n; i++) {
			if (vetor[i] < mediaVetor) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}

		sc.close();
	}

}
