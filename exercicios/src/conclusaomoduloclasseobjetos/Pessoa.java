package conclusaomoduloclasseobjetos;

public class Pessoa {
	String nome;
	double pesoInicial;
	double pesoJantar;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.pesoInicial = peso;
		this.pesoJantar = peso;
	}
	void comendo(Comida c1) {
		this.pesoJantar += c1.peso;
	}
	void pesoDuranteJantar() {
		System.out.println(this.nome + ": " + this.pesoJantar + "Kgs.");
	}
	void impressaoDadosPessoa() {
		System.out.printf("ANTES --> %s: %.2fKg \nDEPOIS --> %s: %.2fKg",this.nome,this.pesoInicial,this.nome,this.pesoJantar);
	}
}
