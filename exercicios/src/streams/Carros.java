package streams;

import java.util.function.UnaryOperator;

public class Carros {
	
	//fazendo o construtor ser privado não tem como instanciar um objeto do tipo carros. Dando mais enfase a uma classe com métodos puramente staticos.
	private Carros(){
		
	}
	public static UnaryOperator<String> maiusculo = nome -> nome.toUpperCase();
	public static UnaryOperator<String> primeiraLetra = nome -> nome.charAt(0) + " ";
	public static UnaryOperator<String> ultimaLetra = nome -> nome.charAt((nome.length() - 2)) + " ";
	public static UnaryOperator<String> translateNome= nome -> nome.translateEscapes();
	public static String grito(String nome) {
		return nome = nome + "!!\n";	
	}
	
}
