package arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double notas[] = {9.5, 10, 5.6, 7.4};
		
		for(double nota: notas) {
			System.out.print(nota + " ");
		}
		System.out.println();
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
	}
}
