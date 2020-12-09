package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PaginaSite {

	public static void main(String[] args) {

		Produto p1 = new Produto("Adidas", "Sapato", 150.56, 0.15);
		Produto p2 = new Produto("Adidas", "Mochila", 200.25, 0.10);
		Produto p3 = new Produto("Adidas", "Blusão", 115.59, 0.20);
		Produto p4 = new Produto("Adidas", "Calça", 100, 0.9);
		Produto p5 = new Produto("Nike", "Sapato", 125.99, 0.15);
		Produto p6 = new Produto("Nike", "Mochila", 180.90, 0.20);
		Produto p7 = new Produto("Nike", "Blusão", 120.35, 0.1);
		Produto p8 = new Produto("Nike", "Calça", 95.95, 0.08);
		Produto p9 = new Produto("Reserva", "Sapato", 150.56, 0.15);
		Produto p10 = new Produto("Reserva", "Mochila", 150.56, 0.15);
		Produto p11 = new Produto("Reserva", "Blusão", 150.56, 0.15);
		Produto p12 = new Produto("Reserva", "Calça", 150.56, 0.15);

		List<Produto> listagemProdutos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
		Consumer<String> println = (situacaoProduto) -> System.out.println(situacaoProduto);
		Predicate<Produto> filtroDesconto = produto -> produto.desconto >= 50;
		System.out.println(listagemProdutos.stream().noneMatch(filtroDesconto));
		/**
		 * Fazer quatros filtros e maps. Primeiro filter, será desconto Segundo filter,
		 * será marca Terceiro filter, será preco Quarto filter, será o produto
		 */

		

		Scanner scan = new Scanner(System.in);
		System.out.print("**********MENU**********\n1-Desconto\t2-Marca\n3-Produto\t4-Preço\nInforme o filtro: ");
		int filtroMenu = scan.nextInt();
		double filtroDescontoPreco;
		String filtroMarcaProduto;
		switch (filtroMenu) {
		case (1):
			System.out.println("Informe o desconto mínimo: ");
			filtroDescontoPreco = scan.nextDouble();
			//Predicate<Produto> filtroDesconto = produto -> produto.desconto >= filtroDescontoPreco;
			//Function<Produto, String> ProdutosDesconto = produto -> String.format("%s da %s tem desconto de %.2f%%",
			//		produto.nome, produto.marca, produto.desconto * 100);
		//	listagemProdutos.stream().filter(filtroDesconto).map(ProdutosDesconto).forEach(println);
			break;
		case (2):
			System.out.println("Informe a marca: ");
			filtroMarcaProduto = scan.next();
			Predicate<Produto> filtroMarca = produto -> produto.marca.equalsIgnoreCase(filtroMarcaProduto);
			Function<Produto, String> ProdutosMarca = produto -> String.format("%s tem preço de R$%.2f", produto.nome,
					produto.preco * (1 - produto.desconto));
			listagemProdutos.stream().filter(filtroMarca).map(ProdutosMarca).forEach(println);
			break;
		case (3):
			System.out.println("Informe o produto: ");
			filtroMarcaProduto = scan.next();
			Predicate<Produto> filtroProduto = produto -> produto.nome.equalsIgnoreCase(filtroMarcaProduto);
			Function<Produto, String> ProdutosProduto = produto -> String.format("%s da %s tem preço de R$%.2f",
					produto.nome, produto.marca, produto.preco * (1 - produto.desconto));
			listagemProdutos.stream().filter(filtroProduto).map(ProdutosProduto).forEach(println);
			break;
		case (4):
			System.out.println("Informe o preço máximo: ");
			filtroDescontoPreco = scan.nextDouble();
			Predicate<Produto> filtroPreco = produto -> produto.preco <= filtroDescontoPreco;
			Function<Produto, String> ProdutosPreco = produto -> String.format("%s da %s tem preço de R$%.2f",
					produto.nome, produto.marca, produto.preco * (1 - produto.desconto));
			listagemProdutos.stream().filter(filtroPreco).map(ProdutosPreco).forEach(println);
			break;
		}
		scan.close();
	}
}
