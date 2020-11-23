package oo.testes;



import oo.hierarquia.desafio.Carro;
import oo.hierarquia.desafio.Civic;
import oo.hierarquia.desafio.Uno;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro uno1 = new Uno();		
		Civic civic = new Civic();
		
		uno1.velocidadeAtual = 150;
		civic.velocidadeAtual = 90;
		
		/*System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.acelerar();
		civic.acelerar();
	
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.acelerar();
		civic.acelerar();
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.frenar();
		civic.frenar();
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.frenar();
		civic.frenar();
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.frenar();
		civic.frenar();
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.frenar();
		civic.frenar();
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.frenar();
		civic.frenar();
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();
		
		uno1.frenar();
		civic.frenar();
		
		System.out.println(uno1);
		System.out.println(civic);
		System.out.println();*/
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.ligarTurbo();
		civic.acelerar();
		
		System.out.println(civic);
		
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.desligarTurbo();
		civic.acelerar();
		System.out.println(civic);
		
		civic.arLigado();
		civic.acelerar();
		System.out.println(civic);
		System.out.println(civic.getDelta());	
		
		civic.arLigado();
		civic.ligarTurbo();
		civic.acelerar();
		System.out.println(civic);
		System.out.println(civic.getDelta());	
		System.out.println(civic.isTurboLigado());
		System.out.println(civic.isArLigado());
		
	}

}