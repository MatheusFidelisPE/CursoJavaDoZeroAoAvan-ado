package execacao.personalizadaA;

@SuppressWarnings("serial")
public class IntervaloIrregularException extends RuntimeException{

	private String nomeDoAtributo;
	
	public IntervaloIrregularException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está em um intervalo incoerente.", nomeDoAtributo);
	}
	
	
	
}
