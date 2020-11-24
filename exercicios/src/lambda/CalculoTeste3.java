package lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> calc1 = (a, b) ->  a * b;
		System.out.println(calc1.apply(2.0,3.0));		
		BinaryOperator<Double> calc2 = (a, b) ->  a + b;
		System.out.println(calc2.apply(2.0,3.0));		
	
		
	}
}
