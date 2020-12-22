package execacao.personalizadaA;

import oo.composicao.Aluno;

public class TesteException {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("aa", -7);
		
		Aluno aluno1 = null;
		
		try {
			Validar.aluno(aluno1);
			//Validar.aluno(aluno);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			//Validar.aluno(aluno1);
			Validar.aluno(aluno);
		} catch (StringVaziaException | IntervaloIrregularException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Validar.aluno(aluno);
		} catch (IntervaloIrregularException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
}
