package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String nomeCliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	double valorTotalCompra;
	
	void adicionarValor(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	void adicionarValor(String nome, int quantidade, double valor) {
		this.adicionarValor(new Item (nome,quantidade,valor));
	}
	double getValueTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.preco * item.quantidade;
		}
		valorTotalCompra = total;
		return total;
	}
	String printValueTotal() {
		String valorTotal = "Valor total: %.2f R$";
		
		valorTotal = String.format(valorTotal,valorTotalCompra);	
		
		return valorTotal;
	}
}
