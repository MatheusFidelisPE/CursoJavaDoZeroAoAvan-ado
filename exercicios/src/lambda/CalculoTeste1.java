package lambda;

public class CalculoTeste1 {

	public static void main(String[] args) {
		Calculo soma = new Somar();
		Calculo multiplicar = new Multiplicar();
		
		System.out.println(soma.executar(2, 3));
		System.out.println(multiplicar.executar(2, 3));
		
		
	}
}
