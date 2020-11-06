package fundamentos;

import java.util.Scanner;
import java.util.Date;
public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia\n");
		
		System.out.printf("Megasena: %d %d %d %d %d %d%n", 1,2,3,4,5,6);
		System.out.printf("Salário: %.1f%n", 1234.645);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");		
		int idade = entrada.nextInt();
		
		System.out.printf("Nome: %s \nIdade: %d", nome, idade);
		
		entrada.close();
		Date d = new Date();
		System.out.println(d);
		
		
	}
}
