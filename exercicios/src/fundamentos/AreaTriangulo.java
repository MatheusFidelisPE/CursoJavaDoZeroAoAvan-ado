package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[] args) {
		System.out.print("             Inicio do Programa\nInforme a altura do triangulo: ");
		Scanner entrada = new Scanner(System.in);
		
		double alturaTriangulo = entrada.nextDouble();
		System.out.print("Informe a base do triangulo: ");
		double baseTriangulo = entrada.nextDouble();
		
		double area = alturaTriangulo * baseTriangulo / 2;
		entrada.close();
		
		System.out.println("Valor da área do triangulo: " + area + "m²");
	}
}
