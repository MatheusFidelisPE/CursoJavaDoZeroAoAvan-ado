package oo.composicao.ecommerce;

import java.util.ArrayList;

public class Cliente {
	
	String nome;
	
	final ArrayList<Compra> compras = new ArrayList<Compra>();
	
	
	Cliente(String nome){
		this.nome = nome;		
	}
	void adicionarCompra(Compra compra) {
		compra.cliente = this;
		compras.add(compra);
	}
	double somarCompras() {
		double total = 0.0;
		
		for(Compra compra: compras) {
			total += compra.Somaritens();
		}
		
		return total;
	}
	
}
