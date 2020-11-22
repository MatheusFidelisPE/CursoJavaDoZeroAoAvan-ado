package oo.polimorfismo;

public class Comida {

	double peso;
	Comida(double peso){
		setPeso(peso);
	}
	void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
	
}
