package lambda;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		Produto p1 = new Produto("notebook", 3500.99, 0.15);
		
		Function<Produto, Double> valorReal = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> calcularImposto = produto -> produto>=2500? produto * 1.085: produto;
		UnaryOperator<Double> calcularFrete = produto -> produto>=3500? produto+100: produto+50;
		Function<Double, String> formatandoImpressao = produto -> String.format("Preço Final: R$%.2f",produto);
		
		System.out.println(valorReal.andThen(calcularImposto).andThen(calcularFrete).andThen(formatandoImpressao).apply(p1));
		
		
		
		
		
		
		
		
	}
}
