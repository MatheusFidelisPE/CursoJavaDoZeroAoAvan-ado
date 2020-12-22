package execacao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
	
		
		
		try {
			gerarErro2();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	
		System.out.println("Fim :)");
	}

	static void gerarErro1() throws RuntimeException{
			throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}
	
	static void gerarErro2(){
		gerarErro1();
	}
}
