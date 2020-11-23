package bibliotecas;

public class TesteSistemaFaculdade {
	
	public static void main(String[] args) {
		Aluno al1 = new Aluno("Matheus", "Ciência da computação");
		System.out.println(al1.getDados());
		
		al1.adicionarLivroAlugado("Harry potter e a camara secreta");
		al1.adicionarLivroAlugado("Diario de um banana");
		al1.adicionarLivroAlugado("Historia da arte");
		al1.livrosAlugados();
		al1.devolverLivroAlugado("Historia da arte");
	}
	
}
