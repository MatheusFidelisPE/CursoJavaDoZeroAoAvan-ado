package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class If {
	
	public static void main(String[] args) {
		//Scanner entrada = new Scanner(System.in);
		String entrada = JOptionPane.showInputDialog("Media");
		//System.out.print("Informe a média: ");
		double media = Double.parseDouble(entrada);
		
		if(media >= 7.0 && media <= 10)
		{
			System.out.println("Aprovado");
			System.out.println("Parabéns!");
		}
		else if(media < 7 && media >= 3)
		{
			System.out.println("Recuperação");
		}
		else if(media < 3)
		{
			System.out.println("Reprovado");
		}
		else
		{
			System.out.println("Valor digitado não pertence ao intervalo fechado de 0 a 10!");
		}
		 
		//entrada.close();
		
	}

}
