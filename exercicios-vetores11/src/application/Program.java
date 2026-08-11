package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double maior = 0;
		double somaAlturasF = 0;
		int pessoa = 0;
		System.out.print("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();

		double[] altura = new double[n];
		char[] genero = new char[n];

		for (int i = 0; i < n; i++) {
			pessoa++;
			System.out.print("Altura da " + pessoa + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + pessoa + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}

		double menor = altura[0];
		System.out.print("\nMenor altura = ");
		for (int i = 0; i < n; i++) {

			if (altura[i] < menor) {
				menor = altura[i];
			}
		}
		System.out.printf("%.2f", menor);

		System.out.print("\nMaior altura = ");
		for (int i = 0; i < n; i++) {

			if (maior < altura[i]) {
				maior = altura[i];
			}
		}
		System.out.printf("%.2f", maior);

		System.out.print("\nMedia das alturas das mulheres = ");
		int quantF = 0;
		for (int i = 0; i < n; i++) {
			if (genero[i] == 'F') {
				somaAlturasF += altura[i];
				quantF++;
			}
		}
		double calculo = somaAlturasF / quantF;
		System.out.printf("%.2f", calculo);

		System.out.print("\nNumero de homens = ");
		int quantM = 0;
		for (int i = 0; i < n; i++) {
			if (genero[i] == 'M') {
				quantM++;
			}
		}

		System.out.print(quantM);

		sc.close();
	}

}
