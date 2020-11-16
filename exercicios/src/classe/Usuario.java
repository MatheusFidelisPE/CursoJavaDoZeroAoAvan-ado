package classe;

import java.util.Random;

public class Usuario {
	String nome;
	String email;
	

	public boolean equals(Object obj) {
		if(obj instanceof Usuario) {
		Usuario outro = (Usuario) obj;
		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		//boolean valorAleatorio = this.valorAleatorio() == outro.valorAleatorio(); 
		return nomeIgual && emailIgual;
		}
		else {
			return false;
		}
	}
	int valorAleatorio() {
		Random random = new Random();
		int num = random.nextInt(2);
		return num;
	}
}
