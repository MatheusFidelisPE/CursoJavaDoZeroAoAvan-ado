package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		Supplier<List<String>> umLista = () -> Arrays.asList("Matheus", "Julia", "Marcio", "Junior", "Gabriela");
		
		System.out.println(umLista.get());
		int a = 4, b = 6;
		Supplier<Integer> soma = () -> a+b;
		System.out.println(soma.get());
	}
}
