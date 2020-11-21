package oo.composicao;

public class Motor {
	
	final Carro carro;
	double coeficienteAceleracao = 1;	
	boolean ligado;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	int girosMotor() {
		if(ligado) {
			return (int) (3000 * coeficienteAceleracao);	
		}
		else {
			return 0;
		}
	}	
}

	
