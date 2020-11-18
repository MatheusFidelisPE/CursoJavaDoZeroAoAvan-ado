package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> Livros = new ArrayDeque<String>();
		
		Livros.add("O mundo de sofia");
		Livros.add("O pequeno principe");
		Livros.offer("Harry Potter");
		Livros.offer("Diario de um banana");
		
		Deque<String> Livros1 = new ArrayDeque<String>();
		
		Livros1.add("O mundo de sofia");
		Livros1.add("O pequeno principe");
		Livros1.offer("Harry Potter");
		Livros1.offer("Diario de um banana");
		
		for(String livro: Livros) {
			System.out.println(livro);
		}
		System.out.println();
		System.out.println(Livros.element());
		System.out.println(Livros.peek());
		System.out.println();
		
		System.out.println(Livros.poll());
		System.out.println(Livros.remove());
		System.out.println(Livros.pop());
		
		System.out.println();
		System.out.println(Livros);
		System.out.println(Livros.contains("Diario de um banana"));
		System.out.println("Tamanho: " + Livros.size());
		System.out.println();
		
		Livros.addAll(Livros1);
		System.out.println(Livros);
		
		Livros.addLast("O misterio do 5 estrelas");
		System.out.println(Livros);
		
		System.out.println(Livros.hashCode());
	
	}
}
