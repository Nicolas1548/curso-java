import java.util.Scanner;
void main() {
	int num;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um numero");
	num = sc.nextInt();
	
	if (num >= 0) {
		System.out.println("Positivo");
		
	}else {
		System.out.println("Negativo");
	}
	
	
	
}