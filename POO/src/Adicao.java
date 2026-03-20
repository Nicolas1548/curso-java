
public class Adicao {
public void adc() {
	Adicao a = new Adicao();
	
IO.println("Input number.");
int num1 = Integer.parseInt(IO.readln());

IO.print("Input another number.");
int num2 = Integer.parseInt(IO.readln());

IO.println("Resultado = " + (num1+num2));
a.adc();
}

}
