package oo.abstrato;

public class AnimalTeste {
	
	//Impossível fazer isso. Pois a classe do tipo animal é abstrata e não é capaz de instanciar um objeto
	//Animal a1 = new Animal();
	
	//Impossível fazer isso. Pois a classe do tipo animal é abstrara e não é capz de instanciar um objeto.
	//Animal a1 = new Mamifero();
	
	//Possível fazer isso. Pois a classe cachorro é uma subclasse de Animal e portanto pode ser instanciado um objeto cachorro do tipo animal
	//Além de que, cachorro é uma classe concreta. Podendo instanciar um objeto usando a própria.
	Animal a1 = new Cachorro();
	
	Mamifero a2 = new Cachorro();
	Cachorro a3 = new Cachorro();
	public static void main(String[] args) {
		AnimalTeste teste = new AnimalTeste();
		System.out.println(teste.a1.numeroDeCoracoes());
		System.out.println(teste.a1.respirar());
		System.out.println(teste.a1.TemPelos());
		System.out.println(teste.a2.habitatNatural("Casas"));
		System.out.println(teste.a2.mamar());
		System.out.println(teste.a3.nome("Leonardo"));
	}
}
