package fundamentos;

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("             Inicio do Programa\n\nInforme o valor que será elevado ao quadrado e ao cubo: ");
		
		double valor = entrada.nextDouble();
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		System.out.printf("O %.0f ao quadrado é %.0f e é igual a %.0f quando elevado ao cubo.", valor, quadrado, cubo);
		
		entrada.close();
		
	}
}
