package classe;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("feijão", 3.5,0.0);
		System.out.println(p1.nome + p1.preco);
		Produto p2 = new Produto();
		Produto p3 = new Produto();
		System.out.println(p2.desconto);
		Produto.desconto = 0.3;
		System.out.println(p3.desconto);
		p3.preco = 100;
		System.out.println(p3.precoFinal());
	}
}
