import java.util.Scanner;

public static void main(String[] args) {
	double cod, quant;

	Scanner sc = new Scanner(System.in);
	cod = sc.nextDouble();
	quant = sc.nextDouble();

	double total;
	if (cod == 1) {
		total = quant * 4.0;
	} else if(cod == 2) {
		total = quant * 4.5;
	} else if (cod == 3) {
		total = quant * 5.0;
	} else if (cod == 4) {
		total = quant * 2.0;
	} else {
		total = quant * 1.5;
	}
	
	System.out.printf("Total: R$ %.2f%n ",total);

}
