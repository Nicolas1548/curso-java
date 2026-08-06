package entities;

public class Conta {
	private String titular;
	private double saldo;

	public Conta() {

	}

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public Conta(String titular, double saldo, double depositoNovo) {
		this.titular = titular;
		this.saldo = saldo;
		depositar(depositoNovo);
	}

	public double depositar(double valor) {

		if (valor <= 0) {
			System.out.println("Não e possivel depositar esse valor!!");
			return saldo;
		}
		return saldo += valor;

	}

	public double sacar(double valor) {
		if (valor > saldo) {
			System.out.println("Não há saldo suficiente para sacar!");
			return saldo;
		}
		return saldo -= valor;

	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String toString() {
		return "Conta: " + titular + ", Saldo bancário: " + String.format("%.2f", saldo);
	}

}
