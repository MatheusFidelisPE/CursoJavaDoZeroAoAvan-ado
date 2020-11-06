package fundamentos;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Informe a sua altura(em cm): ");
		int altura = entrada.nextInt();
		
		double imc = peso / Math.pow(altura/100.0, 2);
		System.out.println("Seu IMC: " + imc);
		
		entrada.close();
		
	}
}
