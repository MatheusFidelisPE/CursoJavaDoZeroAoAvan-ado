package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	private static double precoCompra;

	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");

		Produto p1 = new Produto("Caneta", 1.0, 0.1);
		Produto p2 = new Produto("Caderno", 10.10, 0.25);
		Produto p3 = new Produto("Lapís", 0.5, 0.0);
		Produto p4 = new Produto("Mochila", 105.05, 0.0);
		Produto p5 = new Produto("Notebook", 2500.15, 0.3);
		
		List<Produto> listaDeCompras = Arrays.asList(p1,p2,p3,p4,p5);
		
		listaDeCompras.forEach(imprimir);
		listaDeCompras.forEach(soma -> 
			{
			precoCompra += soma.preco;
			if(soma.nome.equals("Notebook"))
				{
					System.out.println("Preço da compra: " + precoCompra);
				}
			});
	}
}
