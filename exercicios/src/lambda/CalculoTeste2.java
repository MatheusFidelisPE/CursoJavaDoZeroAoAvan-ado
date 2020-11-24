package lambda;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		//Implementando métodos lambda para evitar a construção de classes.
		
		Calculo soma = (a, b) -> {return a + b;};
		Calculo multiplicar = (a,b)-> a*b;
		
		System.out.println(soma.executar(3, 2));
		System.out.println(multiplicar.executar(2, 3));
	}
}
