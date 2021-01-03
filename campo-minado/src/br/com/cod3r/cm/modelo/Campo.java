package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	/*
	 * Posição(x,y)
	 * Composição (Mina, números ou vazio)
	 * Estado (Aberto, fechado, marcado como minado)
	 * 
	 */
	int limiteTabuleiroX;
	int limiteTabuleiroY;
	
	private final int positionX;
	private final int positionY;
	
	private boolean minado = false;
	private boolean aberto = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>(); 
	
	
	public Campo(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		
		for(int contadorLinha = -1; contadorLinha < 2; contadorLinha++) {
			for(int contadorColuna = -1; contadorColuna < 2; contadorColuna++) {
				if(this.positionX + contadorColuna >=0 && this.positionX + contadorColuna <= limiteTabuleiroX
						&& this.positionY + contadorLinha >=0 && this.positionY + contadorLinha <= limiteTabuleiroY ) {
					vizinhos.add(vizinho);
				}
			}
		}
		return false;
	}
	

}
