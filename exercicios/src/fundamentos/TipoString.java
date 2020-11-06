package fundamentos;


public class TipoString {
	public static void main(String[] args) {
		
		String s = "Boa tarde";
		System.out.println(s);
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.equals("Boa"));
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.charAt(0));
		
		var nome = "Matheus";
		var sobreNome = "Fidelis";
		var idade = 20;
		var salario = 12000.50F;
		System.out.println("\nNome: " + nome + "\nSobre Nome: " + sobreNome + " \nIdade: " + idade + " \nSalário: " + salario);
		
		System.out.printf("Nome: %s %s tem %d anos e ganha %.2f R$.\n ", nome, sobreNome, idade, salario );
		
		String frase = String.format("Nome: %s %s tem %d anos e ganha %.2f R$.\n ", nome, sobreNome, idade, salario );
		System.out.println(frase);
		
		System.out.println("Vamos trabalhar com métodos".compareTo("Vamos trabalhar com método"));
		
		
		
	}
}
