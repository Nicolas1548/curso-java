
import java.util.Scanner;

void main() {
	int num;

	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um numero!");
	num = sc.nextInt();

	if (num % 2 == 0) {
		System.out.println("Par");
	} else {
		System.out.println("Impar");
	}

}
