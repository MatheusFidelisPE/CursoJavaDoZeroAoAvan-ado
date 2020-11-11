package classe;

public class Data {
	int year;
	int month;
	int day;
	Data(int diaInicial, int monthInicial, int yearInicial)
	{
		day = diaInicial;
		month = monthInicial;
		year = yearInicial;		
	}
	Data(){
		day = 1;
		month = 1;
		year = 1970;
	}
	String formatandoData() {
		String formatacao;
		formatacao = String.format("%d/%d/%d", day,month,year); 
		return formatacao;
	}
}
