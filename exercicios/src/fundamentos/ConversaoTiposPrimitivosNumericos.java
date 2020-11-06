package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 2; //Conversão implicita
		System.out.println(a);
		
		float b = (float) 1.2; //Conversão explicita (CAST)
		System.out.println(b);
		
		int c = (int) b; 	//Conversão explicita 
		System.out.println(c);
		
		byte d = (byte) c; // Conversão explicita
		System.out.println(d);
		
		double e = 2342.2341;
		int f = (int) e;
		System.out.println(f);
		
	
	}
}
