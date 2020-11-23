package bibliotecas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Aluno extends Personagens{
	
	Random generatematricula = new Random();
	private List<String> livrosAlugados = new ArrayList<>();
	private final String nome;
	private String curso;
	private final int matricula;
	double coefRendimento;
	
	Aluno(String nome, String curso){
		this.nome = nome;
		this.curso = curso;
		this.matricula =  Math.abs(generatematricula.nextInt());
	}
	
	public String getDados() {
		return String.format("Meu nome é %s\nCurso: %s\nMatrícula: %d", this.nome,this.curso,this.matricula);
	}
	public void  adicionarLivroAlugado(String livro){
		livrosAlugados.add(livro);		
	}
	public void  devolverLivroAlugado(String livro){
		for(String livroLista: livrosAlugados) {
			if(livroLista.equals(livro)) {
			livrosAlugados.remove(livro);
			}
		}
	}
	public void livrosAlugados() {
		System.out.println("Livros Alugados: ");
		for(String livro: livrosAlugados) {
			System.out.println(livro + " ");
		}
	}
	

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(coefRendimento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((generatematricula == null) ? 0 : generatematricula.hashCode());
		result = prime * result + ((livrosAlugados == null) ? 0 : livrosAlugados.hashCode());
		result = prime * result + matricula;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (Double.doubleToLongBits(coefRendimento) != Double.doubleToLongBits(other.coefRendimento))
			return false;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (generatematricula == null) {
			if (other.generatematricula != null)
				return false;
		} else if (!generatematricula.equals(other.generatematricula))
			return false;
		if (livrosAlugados == null) {
			if (other.livrosAlugados != null)
				return false;
		} else if (!livrosAlugados.equals(other.livrosAlugados))
			return false;
		if (matricula != other.matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}
