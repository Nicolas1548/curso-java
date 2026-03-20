import java.util.Scanner;
public class exercicio4 {
 void main() {
	 
	 
	 int cod1, num1 , cod2, num2;
	 double preco1, preco2;
	 
	 
	 Scanner sc = new Scanner(System.in);
	 
	 cod1 = sc.nextInt();
	 num1 = sc.nextInt();
	 preco1 = sc.nextDouble();
	 cod2 = sc.nextInt();
	 num2 = sc.nextInt();
	 preco2 = sc.nextDouble();
	 
	 double res1 = (num1 * preco1);
	 double res2 = (num2 * preco2);
	 double soma = (res1 + res2);
	 
	 System.out.println("Valor a pagar: R$"+soma);
	 sc.close();
	 
 }
}
