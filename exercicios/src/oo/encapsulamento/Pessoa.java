package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	String sobreNome;
	
	Pessoa(String nome, String sobreNome, int idade){
		setIdade(idade);
		setNome(nome);
		setSobreNome(sobreNome);
	}
	private String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	private String getSobreNome() {
		return sobreNome;
	}
	String getNomeCompleto() {
		String nomeCompleto;
		nomeCompleto = String.format("%s %s", getNome(), getSobreNome());
		return nomeCompleto;
	}
	void setIdade(int idade) {
		idade = Math.abs(idade);
		if(idade <= 120) {
			this.idade = idade;
		}
	}
	private int getIdade() {
		return this.idade;
	}
	@Override
	public String toString() {
		String retorno;
		retorno  = String.format("Meu nome é %s e tenho %d anos.",getNome(),getIdade());
		return retorno;
	}
	

}
