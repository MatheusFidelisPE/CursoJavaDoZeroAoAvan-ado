package oo.hierarquia;

public class Jogador {

	public int x, y, vida = 100;
	
	public void deslocamentoJogador(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
	}
	
	public boolean atacarOponente(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		}
		else if(deltaY == 0 && deltaX == 1) {
			oponente.vida -= 10;
			return true;
		}
		return false;
		
	}
}
