package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		int nota = 0,qteAlunos = 0, totalNotas = 0;
		Scanner entrada = new Scanner(System.in);
		while(nota != -1) {
			System.out.print("Digite a Nota: ");
			nota = entrada.nextInt();
			if(nota >= 0 && nota<=10) {
				qteAlunos++;
				totalNotas += nota;				
			}
		}
		System.out.println("Qte de notas válidas: " + qteAlunos);
		System.out.println("Média das notas: " + totalNotas / qteAlunos);
	}

}
