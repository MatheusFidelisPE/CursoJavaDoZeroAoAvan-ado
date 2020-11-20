package oo.composicao.ecommerce;

public class Item {
	
	Produto produto;
	int quantidade;

	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
		
	}
	@Override
	public String toString() {
		return produto.nome;
	}
	
}
