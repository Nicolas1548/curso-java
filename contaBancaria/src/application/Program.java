package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta;
		double saldo = 0;

		int opcao = 0;
		System.out.print("Digite o titular da conta: ");
		String titular = sc.nextLine();
		conta = new Conta(titular, saldo);
		while (opcao != 4) {
			System.out.println("");
			System.out.println("-----MENU-----");
			System.out.println("Olá " + titular + ", digite oque deseja!");
			System.out.println("1-Depositar");
			System.out.println("2-Sacar");
			System.out.println("3-Extrato");
			System.out.println("4-Sair");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Qual valor deseja depositar? ");
				double depositoNovo = sc.nextDouble();
				conta.depositar(depositoNovo);
				break;
			case 2:

				System.out.print("Qual valor deseja sacar? ");
				double saque = sc.nextDouble();
				conta.sacar(saque);
				break;
			case 3:
				System.out.println("Extrato bancario: ");
				System.out.println(conta);
				break;
			case 4:
				break;
			}
		}

		/*
		 * System.out.print("Voce gostaria de realizar um deposito, y/n? "); char
		 * resposta = sc.next().charAt(0);
		 * 
		 * if (resposta == 'y') { System.out.println("Qual valor deseja depositar? ");
		 * double depositoNovo = sc.nextDouble(); conta = new Conta(titular, saldo,
		 * depositoNovo); } else { conta = new Conta(titular, saldo); }
		 * 
		 * System.out.println(""); System.out.println(conta);
		 * 
		 * System.out.println(""); System.out.print("Deseja realizar um saque, y/n? ");
		 * char saqueResposta = sc.next().charAt(0); if (saqueResposta == 'y') {
		 * System.out.print("Qual valor deseja sacar? "); double saque =
		 * sc.nextDouble(); conta.sacar(saque); }
		 * 
		 * System.out.println("Atualização bancaria: "); System.out.println(conta);
		 */

		sc.close();
	}

}
