package fundamentos;

import java.util.Scanner;

public class TemperaturaCelsiusToFahrenheit {
	
	public static void main(String[] args) {
		System.out.print("                   Inicio do programa\n\nInforme a temperatura em Celsius: ");
		
		Scanner entrada = new Scanner(System.in);
		
		double temperaturaC = entrada.nextDouble();
		double temperaturaF;
		
		temperaturaF = temperaturaC * 1.8 + 32;
		
		System.out.println("Temperatura Celcius: " + temperaturaC + "\nTemperatura Fahrenheit: " + temperaturaF);
		
		entrada.close();
	}

}
