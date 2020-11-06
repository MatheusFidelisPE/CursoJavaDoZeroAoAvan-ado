package fundamentos;



public class TipoPrimitivo {
	public static void main(String[] args) {
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeViagens = 32764;
		int id = 25564;
		long pontosAcumulados = 254568223;		
		//Tipos númericos reais
		float salario = 12_445.56F;
		double vendasAcumuladas = 2_434.68;
		//Tipo booleano
		boolean estaDeFerias = false;
		//Tipo caractere
		char status = 'A';		
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		//Viagens realizadas pelo funcionario
		System.out.println(numeroDeViagens / 2);
		System.out.println(id);
		System.out.println(pontosAcumulados + vendasAcumuladas+salario);
		System.out.println(estaDeFerias + "conct" + status);
				
		
	}
}
