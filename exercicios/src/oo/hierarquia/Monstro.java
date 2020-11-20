package oo.hierarquia;

public class Monstro extends Jogador { //extends informa que essa classe é uma classe filha de Jogador

	Monstro(){
		this(10,10);
	}
	
	Monstro(int x, int y){
		super(x,y);
	}

}
