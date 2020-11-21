package oo.composicao.ecommerce;

public class ClienteTeste {
	public static void main(String[] args) {
		
		//Cliente cliente1 = Cliente("João José");
		Cliente cliente1 = new Cliente("João José");
		
		Produto p1 = new Produto("Arroz",5.56);
		Produto p2 = new Produto("Feijão", 4.50);
		Produto p3 = new Produto("Carne", 15.99);
		Produto p4 = new Produto("Fubá", 1.50);
		
		
		Item item1 = new Item(p1, 4);
		Item item2 = new Item(p2, 5);
		
		Item item3 = new Item(p3, 2);
		Item item4 = new Item(p4, 10);
				
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		compra1.adicionarItem(item1);
		compra1.adicionarItem(item2);
		
		System.out.println("Produtos: " + compra1.itens);
		
		compra2.adicionarItem(item3);
		compra2.adicionarItem(item4);
		
		
		System.out.println();
		
		System.out.println(compra1.Somaritens());
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		
		System.out.println(cliente1.compras);
		
		System.out.println("Valor total: " + cliente1.somarCompras());
		
		
	}

}
