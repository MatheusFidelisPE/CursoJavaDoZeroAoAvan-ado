package controle;

public class Switch {
	public static void main(String[] args) {
		
		int valor = 1;
		for (int i = 0; i < 10; i++) {
			
			if(i == 5) break;
		}
		switch(valor) {
		case 0:
			System.out.println("Valor é zero");
			break;
		case 1:
			System.out.println("O valor é um");
			break;
		}
	}
}
