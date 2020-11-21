package oo.testes;

import oo.hierarquia.Direcao;
import oo.hierarquia.Heroi;
import oo.hierarquia.Jogador;
import oo.hierarquia.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		//Criando uma variável do tipo jogador, mas instanciando um objeto  heroi, que é uma subclasse de Jogador.
		//Aplicando o conceito de hierarquia.
		
		Jogador heroi = new Heroi();
		Jogador monstro = new Monstro();
				
		heroi.x = 10;
		heroi.y = 10;
			
		monstro.x = 10;
		monstro.y = 11;
		
		System.out.println("Heroi Vida: " + heroi.vida + "\nMonstro Vida: " + monstro.vida);
				
		System.out.println();
		System.out.println("Atacou? " + heroi.atacarOponente(monstro) + " Vida monstro: " + monstro.vida);
		System.out.println("Atacou? " + heroi.atacarOponente(monstro) + " Vida monstro: " + monstro.vida);
		System.out.println();
		System.out.println("Atacou? " + monstro.atacarOponente(heroi) + " Vida Heroi: " + heroi.vida);
		System.out.println("Atacou? " + monstro.atacarOponente(heroi) + " Vida Heroi: " + heroi.vida);

		heroi.deslocamentoJogador(Direcao.NORTE);
		heroi.deslocamentoJogador(Direcao.LESTE);
		heroi.deslocamentoJogador(Direcao.NORTE);
		heroi.deslocamentoJogador(Direcao.LESTE);
		
		System.out.println("X: " + heroi.x);
		System.out.println("Y: " + heroi.y);
		
		heroi.deslocamentoJogador(Direcao.SUL);
		heroi.deslocamentoJogador(Direcao.OESTE);
		heroi.deslocamentoJogador(Direcao.SUL);
		heroi.deslocamentoJogador(Direcao.OESTE);
		
		System.out.println();
		System.out.println("X: " + heroi.x);
		System.out.println("Y: " + heroi.y);
	
	}
}