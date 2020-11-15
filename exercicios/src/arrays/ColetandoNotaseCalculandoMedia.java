package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ColetandoNotaseCalculandoMedia {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quantas notas você deseja salvar no nosso sistema ultassofisticado: ");
		int numeroDeNotas = entrada.nextInt(); 
		
		double notas[] = new double[numeroDeNotas];
		double somaNotas = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Informe a nota[%d]: ", i+1);
			notas[i] = entrada.nextDouble();
		}
		for(double nota: notas) {
			somaNotas += nota;
		}
		System.out.printf("Notas: %s\nMédia: %.2f", Arrays.toString(notas), somaNotas / notas.length);
		entrada.close();
	}
}
