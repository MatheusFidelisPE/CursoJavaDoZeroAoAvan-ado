package fundamentos;

import java.util.Scanner;

public class DesafioConversaoSalarioStringNumber {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String salario1;
		String salario2;
		String salario3;
		
		//Leitura e conversão de salário 1 
		System.out.print("Informe o salario do mês 1: ");
		salario1 = entrada.next();
		salario1 = salario1.replace(",",".");
		double floatsalario1 = Double.parseDouble(salario1);
		
		//Leitura e conversão de salário 2
		System.out.print("Informe o salario do mês 2: ");
		salario2 = entrada.next();
		salario2 = salario2.replace(",",".");
		double floatsalario2 = Double.parseDouble(salario2);
		
		//Leitura e conversão de salário 3
		System.out.print("Informe o salario do mês 3: ");
		salario3 = entrada.next(); // Poderia ter feito da seguinte forma => salario3 = entrada.next().replace(",",".");
		salario3 = salario3.replace(",",".");
		double floatsalario3 = Double.parseDouble(salario3);
		
		//Media dos 3 salarios
		double mediaSalario = (floatsalario1+floatsalario2+floatsalario3) / 3;
				
		System.out.printf("Valor salário 1: R$ %f\nValor salário 2: R$ %.2f\n"
							+ "Valor salário: R$ %.2f\nValor Média dos Salários: R$ %.2f",
							floatsalario1, floatsalario2, floatsalario3, mediaSalario);
		
		entrada.close();
		
	}
}
