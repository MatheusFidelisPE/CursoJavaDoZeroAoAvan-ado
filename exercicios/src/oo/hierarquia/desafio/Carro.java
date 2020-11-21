package oo.hierarquia.desafio;

public class Carro {
	
	public double velocidadeAtual;
	final int VELOCIDADEMAXIMA;
	
	Carro(int velocidadeMaxima){
		VELOCIDADEMAXIMA = velocidadeMaxima;
	}
	
	public boolean acelerar() {
		if(velocidadeAtual + 5 >= VELOCIDADEMAXIMA) {
			velocidadeAtual = VELOCIDADEMAXIMA;
			return true;
		}
		else {
			this.velocidadeAtual += 5;
			return true;
		}
		
	}
	public boolean frenar() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		String velocidade;
		
		velocidade = String.format("Velocidade Atual: %.0f", velocidadeAtual);
		return velocidade;
	}
}