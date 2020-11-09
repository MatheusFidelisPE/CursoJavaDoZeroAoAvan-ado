package controle;

import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] args) {
		int limitador, numero, naoprimo = 0;
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();
		limitador = (int) Math.sqrt(numero);
		
		for (int i = 2; i <= limitador; i++) {
			if(numero%i == 0) {
				naoprimo = 1;
				break;
			}			
		}
		if(naoprimo == 0) {
			System.out.println("Valor é primo!");
		}else {
			System.out.println("Valor não é primo");
		}
	}
}
