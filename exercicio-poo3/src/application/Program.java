package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas notas = new Notas();
		System.out.println("Digite seu nome: ");
		notas.name = sc.nextLine();
		System.out.println("Digite sua nota do primeiro trimestre: ");
		notas.nota1 = sc.nextDouble();
		System.out.println("Digite sua nota do segundo trimestre: ");
		notas.nota2 = sc.nextDouble();
		System.out.println("Digite sua nota do terceiro trimestre: ");
		notas.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", notas.Result());
		
		if (notas.Result() < 60.0) {
			System.out.println("failed");
			System.out.printf("MISSING %.2f POINTS", notas.missingPoints());
		}else {
			System.out.println("PASS");
		}
		
		
		
		sc.close();
	}

}
