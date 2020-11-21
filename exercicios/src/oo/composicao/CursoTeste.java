package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
	
		Aluno aluno1 = new Aluno("Ana");
		Aluno aluno2 = new Aluno("Flor");
		Aluno aluno3 = new Aluno("Bio");
	
		Curso curso1 = new Curso("AM");
		Curso curso2 = new Curso("Python");
		Curso curso3 = new Curso("HTML/CSS");
		
		curso1.adicionarAlunos(aluno3);
		curso1.adicionarAlunos(aluno2);
		
		aluno1.adicionarCurso(curso3);
		aluno1.adicionarCurso(curso2);
		
		aluno3.adicionarCurso(curso2);
		
		System.out.println(aluno1.cursos);
		System.out.println(curso3.alunos);
		System.out.println(aluno3.cursos);
		
		System.out.println(curso1.alunos.contains(aluno1));
		System.out.println(curso2.nome + "\nSituação: " + aluno1.cursoMatriculado(curso2));
		
	}

}
