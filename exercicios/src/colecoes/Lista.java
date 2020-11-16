package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add( new Usuario("Pedro"));
		lista.add(new Usuario("João"));
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Eva"));
		
		System.out.println(lista.get(0).nome);
		System.out.println(lista.get(2).nome);
		
		System.out.println(lista.remove(new Usuario("Maria")));
		System.out.println(lista.contains(new Usuario("João")));
		
		Usuario u = new Usuario("Eva");
		System.out.println("Tem eva? " + lista.contains(u));
		for(Usuario nome: lista) {
			System.out.println(nome.nome);
		}
		
		
		
		
	}
}
