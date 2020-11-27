package lambda;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = 
				maisDois.
				andThen(vezesDois).
				andThen(aoQuadrado).apply(0);
		
		System.out.println(resultado1);
		
		UnaryOperator<String> maiusculo = n -> n.toUpperCase();
		UnaryOperator<String> minusculo = n ->{ 
				n = n.toLowerCase();
				n = n.replace('m', 'n');
				return n;};
		
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.next();
		
		System.out.println(nome);
		nome = maiusculo.apply(nome);
		System.out.println(nome);
		nome = minusculo.apply(nome);
		System.out.println(nome);
		
		
	}

}
