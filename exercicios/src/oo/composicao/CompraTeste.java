package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra compra1 = new Compra();

		compra1.nomeCliente = "Maria Josefina";
		
		compra1.adicionarValor("Lápis", 10, 1.50);
		compra1.itens.add(new Item("Caneta", 5, 2.19));
		compra1.itens.add(new Item("Caderno", 1, 22.50));
		compra1.itens.add(new Item("Estojo", 1, 10.90));

		System.out.println(compra1.itens.size());
		
		compra1.getValueTotal();
		System.out.println(compra1.printValueTotal());
		System.out.println(compra1.itens.get(0).compra.itens.get(1)
);
	}
}
