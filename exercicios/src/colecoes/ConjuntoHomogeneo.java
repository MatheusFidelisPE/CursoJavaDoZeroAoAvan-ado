package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoHomogeneo {

	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<String>();
		Set<String> lista = new TreeSet<>();
		
		lista.add("Teste 1");
		lista.add("teste 2");
		lista.add("teste 3");
		lista.add("teste 4");
		
		for(String strings: lista) {
			System.out.println(strings);
		}
	}
}
