package oo.hierarquia.desafio;

public class Carro {
	
	public double velocidadeAtual;
	final int VELOCIDADEMAXIMA;
	private int delta;
	boolean TurboLigado;
	boolean ArLigado;
	
	Carro(int velocidadeMaxima){
		VELOCIDADEMAXIMA = velocidadeMaxima;
		
	}
	
	public boolean acelerar() {
		if(velocidadeAtual + getDelta() >= VELOCIDADEMAXIMA) {
			velocidadeAtual = VELOCIDADEMAXIMA;
			return true;
		}
		else {
			this.velocidadeAtual += getDelta();
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
	public String toString() {
		String velocidade;
		
		velocidade = String.format("Velocidade Atual: %.0f", velocidadeAtual);
		return velocidade;
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta() {
		if(TurboLigado && !ArLigado) {
			delta = 35;
		}else if(TurboLigado && ArLigado) {
			delta = 30;
		}else if(!TurboLigado && !ArLigado) {
			delta = 25;
		}else if(!TurboLigado && ArLigado) {
			delta = 20;
		}
	}
	public boolean isTurboLigado() {
		return TurboLigado;
	}
	public boolean isArLigado() {
		return ArLigado;
	}
}