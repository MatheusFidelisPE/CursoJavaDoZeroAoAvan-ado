package lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados =  Arrays.asList("Bia", "Gui", "Lia", "Mia", "Giu");
		aprovados.forEach(nome -> System.out.println(nome));
		
		aprovados.forEach(System.out::println);
	}
}
