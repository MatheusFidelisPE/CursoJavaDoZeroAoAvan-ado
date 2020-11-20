package oo.composicao;

public class Carro {
	
	final Motor motor;	
	
	Carro(){
		this.motor = new Motor(this);
	}
	void acelerar() {
		if(motor.ligado) {
			motor.coeficienteAceleracao += 0.3;
		}
	}
	void frenar() {
		if(motor.ligado) {
			motor.coeficienteAceleracao -= 0.3;
		}
	}
	void ligarCarro() {
		motor.ligado = true;
	}
	void desligarCarro() {
		motor.ligado = false;
		motor.coeficienteAceleracao = 1;
	}
	boolean estaLigado() {
		return motor.ligado;
	}
	
}
