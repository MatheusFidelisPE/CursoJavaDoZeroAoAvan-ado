package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		//Formas de imprimir a situação de um aluno após notas.
		BinaryOperator<Double> media = (n1, n2) -> (n1+n2)/2;
		
		double notamedia = media.apply(6.0, 6.0);
		System.out.println(notamedia);
		
		Function<Double, String> situacao = nomeacao -> nomeacao >= 7.0? "Aprovado" : "Reprovado";
		System.out.println(media.andThen(situacao).apply(7.5, 8.0));
		
		BiFunction<Double, Double, String> posicao = (n1,n2) -> ((n1+n2)/2) >= 7? "Aprovado": "Reprovado";
		System.out.println(posicao.apply(5.0, 6.0));
	}
}
