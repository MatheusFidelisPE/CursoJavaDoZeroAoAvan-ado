package oo.hierarquia.desafio;

public class Civic extends Carro  implements Esportivo, Luxo{
	
	public Civic(){
		super(260);
		super.setDelta();
	}
	public boolean acelerar() {
		super.acelerar();
		return true;
	}
	public void ligarTurbo() {
		TurboLigado = true; 
		super.setDelta();
	}
	public void desligarTurbo() {
		TurboLigado = false;
		super.setDelta();
	}
	public void arLigado() {
		ArLigado = true;
		super.setDelta();
	}
	public void arDesligado() {
		ArLigado = false;
		super.setDelta();
	}
	public String toString() {
		String fraseImpressao;
		fraseImpressao = String.format("Velocidade atual Civic: %.0f", velocidadeAtual);
		return fraseImpressao;
	}
}