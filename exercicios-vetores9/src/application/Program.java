package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas voce vai digitar?");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		int maisVelho = 0;
		int pessoa = 0;
		int posicao = 0;

		for (int i = 0; i < n; i++) {
			pessoa++;
			System.out.println("Dados da " + pessoa + "a pessoa:");
			sc.nextLine();
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}

		System.out.println("\nPESSOA MAIS VELHA: ");
		for (int i = 0; i < n; i++) {
			if (maisVelho < idade[i]) {
				maisVelho = idade[i];
				posicao = i;
			}
		}
		System.out.printf("%s\n", nome[posicao]);

		sc.close();
	}

}
