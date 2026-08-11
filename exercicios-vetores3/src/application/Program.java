package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados da pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}

		int menores = 0;
		double alturaTotal = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				menores++;
			}
			alturaTotal = alturaTotal + altura[i];

		}

		double mediaAltura = alturaTotal / n;
		double calculo = (Double.valueOf(menores) / n) * 100.0;

		System.out.printf("Altura média: %.2f\n ", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", calculo);

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.printf("%s\n", nome[i]);
			}

		}

		sc.close();
	}

}
