package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		Stream<String> lista = Stream.of("C ", "Assembly ", "Ladder\n");
		lista.forEach(print);
		
		
		String outralista[] = {"Go ", "Python ", "Java\n"};
		Stream.of(outralista).forEach(print);
		Arrays.stream(outralista).forEach(print);
		Arrays.stream(outralista, 1,outralista.length).forEach(print);
		
		List<String> listaMais = Arrays.asList("Matheus ", "Fidelis ", "da ", "Silva\n");
		listaMais.stream().forEach(print);
		listaMais.parallelStream().forEach(print);
		
		//Gera uma stream de tamanho infinito. O méotodo recebe uma interfece funcional do tipo supplier, que não recebe nenhum parâmetro e retorna algum.
		// Stream.generate(() -> "a").forEach(print);
		
		//Criando um stream com o iterate, que recebe um unaryoperator e constroi um steam de tamanho infinito
		Stream<Integer> stream = Stream.iterate(0, (n) -> n += 1);
		stream.forEach(println);
	}
}
