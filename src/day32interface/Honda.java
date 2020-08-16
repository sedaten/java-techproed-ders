package day32interface;

public class Honda implements Car, Klima {
	/*
	1) Bir Class'i bir interface'in child'i yapmak icin "Implements" keyword 
	kullaniriz.
	2) Abstract Class kullanarak abstraction yaparsak 
	bir classin birden fazla parent koyamayiz. Cunku Java multiple 
	inheritance'a musaade etmez.
	Bu yuzden interface kullaniriz. ve bir class icin 1'den 
	fazla parent olusturarak calisabiliriz.
	3)1'den fazla interfaceyi bir class icin parents yaptiginizda, 
	parents olan interfacelerde ayni isimli method'lar kullanabilirsiniz ama
	return typelari ayni olmali. Ayni olmazsa CTE alirsiniz.
	4)1'den fazla interfaceyi bir class icin parents yaptiginizda, 
	parents olan interfacelerde ayni isimli variable'lar kullanabilirsiniz.
	Ancak hangi variableyi kullanacaginiza interface ismini 
	kullanarak siz karar verirsiniz. Java karar veremez 
	bu yuzden CTE alirsiniz.
	 */
	
	public static void main(String[] args) {
		Honda honda = new Honda();
		honda.antiBakteri();
		honda.direksiyon();
		honda.isitma();
		honda.motor();
		honda.teker();
		System.out.println(Car.i);//12
		System.out.println(Klima.i);//15
	}

	@Override
	public void motor() {
		System.out.println("1.6 VTEC Diesel");
	}

	@Override
	public void direksiyon() {
		System.out.println("suni deri");
		
	}

	@Override
	public void teker() {

		System.out.println("16 inch alasim");
		
	}

	@Override
	public void isitma() {
		System.out.println("isitma var");
	}

	@Override
	public void antiBakteri() {
		System.out.println("99% bakteri koruma");
		
	}

	@Override
	public void fiyat() {
		System.out.println("Ozellige gore degisir");
		
	}

}
