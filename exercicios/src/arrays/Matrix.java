package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Numero de alunos: ");
		int numeroDeAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por aluno: ");
		int qteNotas = entrada.nextInt();
		
		double notasDaTurma[][] = new double[numeroDeAlunos][qteNotas];
		double notasTotais = 0;
		for (int i = 0; i < numeroDeAlunos; i++) {
			for(int j = 0; j < qteNotas; j++) {
				System.out.printf("Informe a nota [%d] do aluno [%d]: ", j+1, i+1);
				notasDaTurma[i][j] = entrada.nextDouble();
			}
		}
		 
		for(int i = 0; i < numeroDeAlunos; i++) {
			for(int j = 0; j < qteNotas; j++) {
				notasTotais += notasDaTurma[i][j];
			}
		}
		for(double notas[]: notasDaTurma) {
			System.out.println(Arrays.toString(notas));
		}
		System.out.println("Média: " + notasTotais / (numeroDeAlunos * qteNotas));
		entrada.close();
	}
}
