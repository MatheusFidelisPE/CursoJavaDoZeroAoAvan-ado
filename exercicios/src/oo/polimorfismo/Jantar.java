package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(86.56);
		
		Comida feijao = new Feijao(0.150);
		Comida arroz = new Arroz(0.20);
		Comida sorvete = new Sorvete(0.250);
		
		System.out.println(p1);
		
		p1.comer(feijao);
		System.out.println(p1);
		
		p1.comer(arroz);
		System.out.println(p1);
		
		p1.comer(sorvete);
		System.out.println(p1);
		
	}
}
