package classe;



public class Produto {

	String nome;
	double preco;
	static double desconto;
	
	
	Produto (){
		desconto = 0.25;
	}
	Produto(String nomeinicial, double precoinicial, double descontoinicial){
		nome = nomeinicial;
		preco = precoinicial;
		desconto = descontoinicial;
	}
	double precoFinal() {
		double precoComDesconto;
		precoComDesconto = preco * (1 - desconto);
		return precoComDesconto;
	}
	
}
