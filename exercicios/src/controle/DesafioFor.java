package controle;

public class DesafioFor {
	public static void main(String[] args) {
		String valor = "#";
		
		while(!valor.equals("######")) {
			System.out.println(valor);
			valor += "#";
		}
	}

}
