import java.util.Scanner;
public class exercicio5 {
void main() {

double a,b,c;
double pi = 3.14159;
Scanner sc = new Scanner(System.in);

a= sc.nextDouble();
b= sc.nextDouble();
c= sc.nextDouble();

System.out.printf("TRIANGULO: %.3f%n", a*c/2);
System.out.printf("CIRCULO: %.3f%n", Math.pow(c, 2)*pi);
System.out.printf("TRAPEZIO: %.3f%n", (a+b)*c/2);
System.out.printf("QUADRADO: %.3f%n", b*b);
System.out.printf("RETANGULO: %.3f%n", a*b);
	
	
}

}
