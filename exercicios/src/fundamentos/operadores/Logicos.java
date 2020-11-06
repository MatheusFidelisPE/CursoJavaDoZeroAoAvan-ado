package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3>7;

		System.out.println(condicao1 && condicao2); //operador lógico e
		System.out.println(condicao1 || condicao2); //operador lógico ou
		System.out.println(condicao1 ^ condicao2); //operador lógico ou exclusivo
		System.out.println(!condicao1); //operador de negação
		System.out.println(!condicao2); //operador de negação
		
		
	}
}
