package oo.composicao;

import java.util.ArrayList;

public class Aluno {
	
	private String nome;
	final ArrayList<Curso> cursos = new ArrayList<Curso>();
	private double nota;
	
	Aluno(String nome){
		this.nome = nome;
	}
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	public String getNome() {
		return nome;
	}

	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	@Override
	public String toString() {
		return nome;
	}

	String cursoMatriculado(Curso escolhido) {
		
		for(Curso curso: this.cursos) {
			if(curso.nome.equals(escolhido.nome)) {
				return "Matriculado";
			}
		}
		return "Não matriculado";
	}
	public double getNota() {
		return this.nota;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
