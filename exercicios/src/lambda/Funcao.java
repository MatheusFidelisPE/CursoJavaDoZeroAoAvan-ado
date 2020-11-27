package lambda;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = valor -> (valor%2 == 0) ? "Par":"Impar";
		Function<String, String> certeza = valor -> "!!" + valor;
		Function<String, String> duvida = valor ->"??" + valor;
		Function<String, String> virgula = valor ->",," + valor;
		Function<String, String> ponto = valor ->".." + valor;
		Function<String, String> apresentacao = valor -> "O valor é: " + valor;
		
		//Function, interface funcional disponível. Para usá-la é preciso passar dois parametros no generics. O primeiro referência o
		//tipo de dado que será entreda e o segundo o tipo de retorno. Ela só recebe um parametro e retorna um valor.
		
		System.out.println(parOuImpar.apply(32));
	
		String resultadoFinal;
		resultadoFinal = parOuImpar.andThen(virgula).andThen(certeza).andThen(apresentacao).andThen(ponto).apply(31);
		//Sequência: appy -> virgula -> certeza -> apresentação -> ponto...
		System.out.println(resultadoFinal);
	}
}
