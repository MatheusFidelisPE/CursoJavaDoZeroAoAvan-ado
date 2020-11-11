package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		data1.day = 31;
		data1.month = 10;
		data1.year = 2008;
		
		System.out.println(data1.formatandoData());
		
		Data data2 = new Data();
		data2.year = 2020;
		data2.month = 11;
		data2.day = 10;
		
		System.out.println(data2.formatandoData());
		
		Data d3 = new Data(10,5,2000);
		Data d4 = new Data();
		
		System.out.println(d3.formatandoData());
		System.out.println(d4.formatandoData());
	}
}
