package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("João", "Farias", 20);
		
		//System.out.println(p1.getNome());
		
		//p1.nome = "Maria";  Como o atributo nome não é mais uma atributo package, o atributo não pode ser alterado desta forma.
		//Da forma que era o atributo nome pode ser alterado sem nenhum controle de procedencia, ou seja, pode ter caracteres indesejados
		//construindo ruídos no seu atributo. Para eliminar esse tipo de problema é possível alterar o nível de encapsulamento do atributo 
		//e permitir alteração somente a partir de um método. Esse tem nivel de encapsulamento menor e pode ser acessado com mais liberdade.
		
		p1.setNome("Maria");
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
		
		
	}
}
