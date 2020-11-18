package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> lista = new LinkedList<String>();
		
		
		//Adicionando elementos na fila.
		//os métodos add e offer adicionam elementos. Tendo seu comportamento diferente apenas quando a fila estiver cheia.
		//o método add retorna uma exception, caso a fila esteja cheia e o offer retorna um valor false.
		
		lista.add("João");
		lista.offer("Maria");
		lista.add("Ana");
		lista.offer("José");
		lista.add("Jonas");
		lista.offer("Joaquim");
		lista.add("Joana");
		
		//Impressão da lista completa
		System.out.println(lista);
		System.out.println("A fila tem Maria?" + lista.contains("matheus"));
		
		//Métodos para capturar o primeiro elemento da fila. Os dois próximos métodos utilizados apenas imprimem o primeiro objeto da fila
		//Os métodos peek e element diferem apenas quando se refere a uma fila vazia, em condições normais o retorno é uma string.
		//O método peek é capaz de retornar um valor NULL já o método element retorna uma exception.
				
		System.out.println(lista.peek());
		System.out.println(lista.element());
		System.out.println(lista.peek());
		System.out.println(lista.element());
		
		
		System.out.println();
		//Os dois próximos métodos são capazes de capturar o primeiro elemento da fila, sendo diferente dos dois anteriores pois estes eliminam
		//os elementos chamados. São eles, poll e remove. Esses diferem entre si quando a lista estiver vazia.
		//poll retorna um valor Null já o remove retorna uma exception
		
		System.out.println(lista.poll());
		System.out.println(lista.remove());
		System.out.println(lista.poll());
		System.out.println(lista.remove());
		System.out.println(lista.poll());
		System.out.println(lista.remove());
		System.out.println(lista.poll());
		System.out.println(lista.poll());
		
	
		
		
		
	}
}
