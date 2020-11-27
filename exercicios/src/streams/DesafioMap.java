package streams;
import java.lang.StringBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
public class DesafioMap {

	public static void main(String[] args) {
		//String numeroBinario = Integer.toBinaryString(numero);
		//System.out.println(numeroBinario);
		
		//StringBuffer inverter = new StringBuffer(numeroBinario);
		//inverter.reverse();
		
		//System.out.println(inverter.getClass());
		//String inverte = inverter.toString();
		//System.out.println(inverte.getClass());
		
	
		
		List<Integer> lista = Arrays.asList(1,3,4,56,7,2,9,11,13,14,90,33,21);
		Consumer<Object> print = numero -> System.out.print(numero + " ");
		Function<Integer, String> convertendoBinario = (numero) -> 
		{		
			String convertidoBinario = new String(Integer.toBinaryString(numero));
			return convertidoBinario;
		};
		UnaryOperator<String> invertendoNumero = numero ->
		{
			StringBuffer inverte = new StringBuffer(numero);
			inverte.reverse();
			return inverte.toString();
		};
		
		Function<String,Integer> voltandoInteiro = valor -> 
		{	
			Integer numero = 0;
			for(int i = 0;  i < valor.length(); i++) {
				if(valor.charAt(i) == '1') {
					numero += (int)  Math.pow(2, valor.length()- (i+1));
				}
			}
			return numero;
		};
		
		
		lista.stream().forEach(print);
		System.out.println();
		lista.stream().map(convertendoBinario).forEach(print);
		System.out.println();
		lista.stream().map(convertendoBinario).map(invertendoNumero).forEach(print);
		System.out.println();
		lista.stream().map(convertendoBinario).map(invertendoNumero).map(voltandoInteiro).forEach(print);
		
	}
}
