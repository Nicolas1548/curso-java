import java.util.Scanner;

void main() {

	int hora;
	Scanner sc = new Scanner(System.in);

	System.out.println("Quantas horas?");
	hora = sc.nextInt();

	if (hora >= 6 && hora < 12) {
		System.out.println("Bom dia!");
	} 
	else if (hora >= 12 && hora <= 18) {
		System.out.println("Boa tarde!");
	} 
	else {
		System.out.println("Boa noite!");
	}

}
