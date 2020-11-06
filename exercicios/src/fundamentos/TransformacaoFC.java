package fundamentos;

public class TransformacaoFC {
	public static void main(String[] args) {
		
		final int retira_trinta_dois = 32;
		final double multiplicador = 5.0 / 9.0;
		double temperatura_f;
		double temperatura_c;
		
		temperatura_f = 48;
		temperatura_c = (temperatura_f - retira_trinta_dois) * multiplicador;
		System.out.println("Temperatura ºF: "+ temperatura_f +"   Temperatura ºC: " + temperatura_c);
		
		temperatura_f = 50;
		temperatura_c = (temperatura_f - retira_trinta_dois) * multiplicador;
		System.out.println("Temperatura ºF: "+ temperatura_f +"   Temperatura ºC: " + temperatura_c);
		
		
		
		
		
	}
}
