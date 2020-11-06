package fundamentos;

public class EquacaoSegundoGrau {
	
	public static void main(String[] args) {
		
		double a = 1, b = 12, c = -13;
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		double x1 = -b + Math.sqrt(delta) / (2 * a);
		double x2 = -b - Math.sqrt(delta) / (2 * a);
		
		System.out.printf("Delta: %.0f\nRaiz 1: %.0f\nRaiz 2: %.0f", delta, x1, x2);
	}

}
