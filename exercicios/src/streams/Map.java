package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		List<String>  listagemCarros = Arrays.asList("Gol ","Uno ","Corolla ", "Civic ");
		
		/**
		 *Pode-se fazer lambdas para lidar com streams aqui no mesmo documento, ou criar uma classe e construir métodos e lambdas em um métodos a parte. */
		UnaryOperator<String> maiusculo = nome -> nome.toUpperCase();
		UnaryOperator<String> primeiraLetra = nome -> nome.charAt(0) + " ";
		UnaryOperator<String> ultimaLetra = nome -> nome.charAt((nome.length() - 2)) + " ";
		UnaryOperator<String> translateNome= nome -> nome.translateEscapes();
		UnaryOperator<String> grito = nome -> nome + "!!\n";
		
		
		listagemCarros
		.stream()
		.map(Carros.maiusculo)
		.map(Carros::grito)
		.forEach(print); 
	}

}
