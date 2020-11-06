package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = true;
		
		//Dois trabalhos derem certo televisão de 50polegadas, 1 trabalho deu certo televisão de 32polegadas, comprando de 50 ou de 
		//32 polegadas a família vai tomar sorvete no shopping, se nenhum dos trabalhos der certo você não comprará nada e nem tomará
		//sorvete e ficará mais saudavel.
		
		boolean sorvete = trabalhoTerca || trabalhoQuinta;
		boolean tv50polegadas = trabalhoTerca && trabalhoQuinta;
		boolean tv32polegadas = trabalhoTerca ^ trabalhoQuinta;
		boolean saudavel = !sorvete;
		
		System.out.println("Televisão de 50 polegadas: " + tv50polegadas);
		System.out.println("Televisão de 32 polegadas: " + tv32polegadas);
		System.out.println("Tomar sorvete no shopping: " + sorvete);
		System.out.println("Ser mais saudavel e não tomar sorvete: " + saudavel);
		
		
		
		
		System.out.println();
	}
}
