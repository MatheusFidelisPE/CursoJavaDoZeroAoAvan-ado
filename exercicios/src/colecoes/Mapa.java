package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> listagem = new HashMap<Integer, String>();
		Map<Integer, Usuario> listagemu = new HashMap<Integer, Usuario>();
		
		listagem.put(1, "Matheus");
		listagem.put(2,"Carla");
		listagem.put(3, "Fulano");
		listagem.put(4, "Ciclano");
		listagemu.put(1, new Usuario("Jorge"));
		System.out.println(listagem);
		
		System.out.println(listagem.keySet());
		System.out.println(listagem.values());
		System.out.println(listagem.entrySet());
		System.out.println(listagem.containsKey(2));
		System.out.println(listagem.containsValue("Ciclano"));
		System.out.println("Listagem Usuarios: " + listagemu);
		System.out.println(listagemu.containsKey(1));
		System.out.println(listagemu.containsValue(new Usuario("Jorge")));
		System.out.println(listagemu.equals(new Usuario("Jorge")));
		for(Entry<Integer, String> lista: listagem.entrySet()) {
			System.out.println(lista.getKey() + " --> " + lista.getValue());
		}
		
	}
}
