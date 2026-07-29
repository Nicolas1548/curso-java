package entities;

public class Notas {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double Result() {
		return nota1 + nota2 + nota3;	
	}
	
	public double missingPoints() {
		if (Result() < 60.0 ) {
			return 60.0 - Result();
	} else {
		return 0.0;
	}
	
	
	
}
}	

