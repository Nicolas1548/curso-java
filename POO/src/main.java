
public class main {
public static void Main() {
	IO.println("Qual calculo deseja fazer?");
	IO.println("1-Adicao");
	IO.println("2-Subtração");
	IO.println("3-Multiplicação");
	IO.println("4-Divisão");
	int opcao = Integer.parseInt(IO.readln());
	
	switch(opcao) {
	case 1:
		adc();
		break;
	}
}
	
}
