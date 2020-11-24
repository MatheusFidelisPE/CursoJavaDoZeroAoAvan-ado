package lambda;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		Predicate<Produto> isCaro = prod -> prod.preco <= 10;
		
		Produto p = new Produto("caneta", 5, 0.5);
		
		System.out.println(isCaro.test(p));
		
	}
}
