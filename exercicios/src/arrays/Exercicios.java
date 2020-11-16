package arrays;

import java.util.Arrays;

public class Exercicios {
	public static void main(String[] args) {
		//Programa para calcular média de notas de alunos usando arrays
		
		double notasAlunoA[] = new double[3];
		//inicializando as notas dos alunos. O carregamento de cada elemento no array é feito da mesma forma, que é feito no C.
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 9.5;
		notasAlunoA[2] = 5.6;
		
		//Impressão das notas presentes no array
		System.out.println(Arrays.toString(notasAlunoA));
		//somatorio das notas
		double totalNotasAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalNotasAlunoA += notasAlunoA[i];					
		}
		System.out.println(totalNotasAlunoA / notasAlunoA.length);
		
		//Outras formas de carregamento de um array
		
		double notasAlunoB[] = {5.6,9.5,10};
		double totalNotasAlunoB = 0;
		System.out.println(Arrays.toString(notasAlunoB));

		for (int i = 0; i < notasAlunoB.length; i++) {
			totalNotasAlunoB += notasAlunoB[i];			
		}
		System.out.println(totalNotasAlunoB / notasAlunoB.length);
		int notasAlunosTurma[][] = new int[3][2];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				notasAlunosTurma[i][j] = i*2+ j*2;
			}
		}
		for(int notasAluno[]: notasAlunosTurma) {
			System.out.println(Arrays.toString(notasAluno));
		}
	}
}
