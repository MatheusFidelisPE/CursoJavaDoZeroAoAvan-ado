package controle;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
	public static void main(String[] args) {
		int valorEscolhido, qte_chances = 10, valorSorteado;
		Random random = new Random();
		Scanner entrada = new Scanner(System.in);
		valorSorteado = random.nextInt(100);
		while(qte_chances > 0) {
			valorEscolhido = entrada.nextInt();
			if(valorEscolhido == valorSorteado) {
				System.out.println("Você acertou!");
				break;
			}else if(valorSorteado > valorEscolhido) {
				System.out.println("O valor sorteado é maior que o valor escolhido!");
			}else if(valorSorteado < valorEscolhido) {
				System.out.println("O valor sorteado é menor que o valor escolhido!");
			}
			System.out.println("Quantidade de chances: " + qte_chances);
			qte_chances--;
			
		}
		
	}

}
