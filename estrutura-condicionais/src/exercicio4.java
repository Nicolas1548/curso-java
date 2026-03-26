import java.util.Scanner;

void main() {
	int horaI, horaF;
	Scanner sc = new Scanner(System.in);

	horaI = sc.nextInt();
	horaF = sc.nextInt();

	if (horaF > horaI) {
		int duracao = horaF - horaI;
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
	} else {
		int duracao = (24 - horaI) + horaF;
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
	}

}
