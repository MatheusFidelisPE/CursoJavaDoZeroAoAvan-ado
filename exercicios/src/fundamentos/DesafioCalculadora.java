package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//Ler o primeiro número
		//Ler o segundo número
		//Ler a operação
		//Imprimir o resultado da operação
		Scanner entrada = new Scanner(System.in);
		Scanner entradaoperador = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		double valor1 = entrada.nextDouble();
		System.out.print("Informe o segundo valor: ");
		double valor2 = entrada.nextDouble();
		System.out.print("Informe a opeação [+ - / *]: ");
		String operation = entradaoperador.next();
		
		double tentativa1 = (operation.equals("+")) ? valor1 + valor2 :  0;
		tentativa1 = (operation.equals("-")) ? valor1 - valor2 :  tentativa1;
		tentativa1 = (operation.equals("*")) ? valor1 * valor2 :  tentativa1;
		tentativa1 = (operation.equals("/")) ? valor1 / valor2 :  tentativa1;
		
		System.out.printf("%f %s %f = %.1f",valor1,operation, valor2, tentativa1);
		
		
		}
}
