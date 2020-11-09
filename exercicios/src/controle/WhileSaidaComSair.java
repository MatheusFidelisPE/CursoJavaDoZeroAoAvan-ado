package controle;

import java.util.Scanner;

public class WhileSaidaComSair {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		boolean variavelControle = false;
		String leitura;
		while(!variavelControle) {
			System.out.print("Digite: ");
			leitura = entrada.nextLine();
			variavelControle = leitura.toLowerCase().equals("sair");
		}
		entrada.close();
	}

}
