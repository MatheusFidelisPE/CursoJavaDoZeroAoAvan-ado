package fundamentos.operadores;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		double media = 7.0;
		
		String situation =  (media >= 7.0) ? "Aprovado" : "Recuperação";
		String situationFinal = (media <= 3.0) ? "Reprovado" : situation;
		
		System.out.println("Situação do aluno: " + situationFinal);
		
	}
}
