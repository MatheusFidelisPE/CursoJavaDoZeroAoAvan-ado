package lambda;

import java.util.function.Predicate;

public class ComposicaoPredicado {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> (num % 2 == 0);
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		Predicate<String> isSmall = texto -> texto.length() < 5;
		
		System.out.println(isPar.or(isTresDigitos).test(15));
		System.out.println(isSmall.test("casa"));
		
	}
}

