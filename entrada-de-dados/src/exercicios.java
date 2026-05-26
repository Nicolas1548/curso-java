import java.util.Scanner;
void main () {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	
	for (int i=1; i<=x; i++) {
		if (i % 2 !=0) {
			System.out.println(i);
		}
	}
}