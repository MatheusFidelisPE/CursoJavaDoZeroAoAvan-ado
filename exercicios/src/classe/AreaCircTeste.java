package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc circ1 = new AreaCirc(10);
		System.out.println(circ1.area());
		
		double teste2 = AreaCirc.PI;
		
		//circ1.PI = 5;
		double teste = circ1.PI + 5;
		
		System.out.println(teste);
		System.out.println(AreaCirc.PI);
		System.out.println(AreaCirc.areacirc(1));
	}
}
