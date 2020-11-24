package lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados =  Arrays.asList("Bia", "Gui", "Lia", "Mia", "Giu");
		aprovados.forEach(nome -> System.out.println(nome));
		
		aprovados.forEach(System.out::println);
		
		aprovados.forEach(nome -> imprimirLinha(nome));
		aprovados.forEach(Foreach::imprimirLinha);
		
	}
	static void imprimirLinha(String nome) {
		System.out.println("Meu nome é: " + nome);
	}
}
