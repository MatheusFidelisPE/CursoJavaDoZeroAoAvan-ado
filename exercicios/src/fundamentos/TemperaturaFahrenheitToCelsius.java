package fundamentos;
import java.util.Scanner;

public class TemperaturaFahrenheitToCelsius {

	public static void main(String[] args) {
		
		System.out.print("               Inicio do Programa\n\nInforme a temperatura em Fahrenheit: ");
		
		Scanner entrada = new Scanner(System.in);
		
		double temperaturaF = entrada.nextDouble();
		double temperaturaC = (temperaturaF - 32) / 1.8;
		
		entrada.close();
		
		System.out.printf("Temperatura Fahrenheit: %.2f °F\nTemperatura Celsius: %.2f °C\n", temperaturaF, temperaturaC);
	}
}
