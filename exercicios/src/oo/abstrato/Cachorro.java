package oo.abstrato;

public class Cachorro extends Mamifero {
	
	//Método de mamífero
	String mamar() {
		return "Mama pelo peito";
	}
	
	//Método de Animal
	String respirar() {
		return "Respira pelo nariz";
	}
	
	String nome(String nome) {
		return nome;
	}
}
