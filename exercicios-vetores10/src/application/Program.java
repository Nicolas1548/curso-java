package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int aluno = 0;
		double media = 6.0;
		double calculo = 0;

		System.out.println("Quantos alunos serao digitados?");
		int n = sc.nextInt();

		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];

		for (int i = 0; i < n; i++) {
			aluno++;
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do " + aluno + "o aluno:");
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}

		System.out.println("Alunos aprovados:");
		for (int i = 0; i < n; i++) {
			calculo = (nota1[i] + nota2[i]) / 2;
			if (calculo >= media) {
				System.out.printf("%s\n", nome[i]);
			}
		}

		sc.close();
	}

}
