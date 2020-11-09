package controle;

import java.util.Scanner;

public class DesafioValorEntre0e10ePar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor;
		valor = entrada.nextInt();
		if(valor > 0 && valor <=10 && valor%2 == 0) {
			System.out.printf("O valor %d está entre 0 e 10 e é par.");
		}
		entrada.close();
	}

}
