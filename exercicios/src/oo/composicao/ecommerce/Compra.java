package oo.composicao.ecommerce;

import java.util.ArrayList;

public class Compra {
	
	Cliente cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	double compraValor;
	String nome;
	
	void adicionarItem(Item item) {
		itens.add(item);
		this.nome = item.produto.nome;
	}
	double Somaritens() {
		double valor = 0.0;
		
		for(Item item: itens) {
			valor += item.quantidade * item.produto.preco;
		}
		
		return valor;
	}
	@Override
	public String toString() {		
		return nome;
	}
}
