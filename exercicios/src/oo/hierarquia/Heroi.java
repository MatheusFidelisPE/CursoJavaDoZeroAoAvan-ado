package oo.hierarquia;

public class Heroi extends Jogador{ //extends informa que esta classe é uma classe filha de Jogador
	
	Heroi(int x, int y){
		super(x,y);
	}
	Heroi(){
		this(10,10);
	}
	
	boolean atacarOponente(Jogador oponente) {
		//Forma de implementar um ataque diferente para o herói é sobre escrevendo o método já existente de jogador e alterando o valor do ataque
		/*int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		}
		else if(deltaY == 0 && deltaX == 1) {
			oponente.vida -= 20;
			return true;
		}
		return false;		
	}*/
		// Outra forma de alterar o ataque do heroi é chamar um método já existente de jogador, atacarOponente(), chamando o método duas vezes.
		
		
		boolean ataque1 = super.atacarOponente(oponente);
		boolean ataque2 = super.atacarOponente(oponente);
		
		return ataque1 && ataque2; 
		
	}
}
	
