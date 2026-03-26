import java.util.Scanner;

void main() {
	Scanner sc = new Scanner(System.in);

	double numero = sc.nextDouble();

	if (numero < 0.0 || numero > 100.0) {
		System.out.println("Fora do intervaldo!!");
	} 
	else if (numero <= 25.00) {
		System.out.println("Intervalo [0,25]");
	} 
	else if (numero <= 50.00) {
		System.out.println("Intervalo (25,50]");
	} 
	else if (numero <= 75.00) {
		System.out.println("Intervalo (50,75]");
	} 
	else {
		System.out.println("Intervalo (75,100]");
	}
}
