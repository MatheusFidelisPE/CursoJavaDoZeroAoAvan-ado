package execacao.personalizadaA;

import oo.composicao.Aluno;

public class Validar {

	private Validar() {}
	
	
	public static void aluno(Aluno aluno) {
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo.");
		}
		if(aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		if(aluno.getNota() < 0 || aluno.getNota() > 11) {
			throw new IntervaloIrregularException("nota");
		}
	}
}
