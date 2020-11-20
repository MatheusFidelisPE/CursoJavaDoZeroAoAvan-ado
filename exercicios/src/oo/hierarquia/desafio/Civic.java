package oo.hierarquia.desafio;

public class Civic extends Carro {
	
	Civic(){
		super(260);
	}
	
	
	boolean acelerar() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
		return true;
	}
}
