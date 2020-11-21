package oo.hierarquia;

public class Heroi extends Jogador{ //extends informa que esta classe é uma classe filha de Jogador
	
	public boolean atacarOponente(Jogador oponente) {
		super.atacarOponente(oponente);
		super.atacarOponente(oponente);
		super.atacarOponente(oponente);
		return true;
	}
}
