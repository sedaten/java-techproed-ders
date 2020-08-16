package day32interface;

public class Audi implements Car, Klima {

	public static void main(String[] args) {
		Audi audi = new Audi();
		audi.antiBakteri();
		audi.direksiyon();
		audi.isitma();
		audi.motor();
		audi.teker();
		System.out.println(Car.i);

	}

	@Override
	public void motor() {
		System.out.println("2.8 Turbo Benzinli");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Deri dreksiyon");
		
	}

	@Override
	public void teker() {
		System.out.println("Michelen 24 inch celik jant");
		
	}

	@Override
	public void isitma() {
		System.out.println("Akilli isitma");
		
	}

	@Override
	public void antiBakteri() {
		System.out.println("100% bakteri koruma");
		
	}

	@Override
	public void fiyat() {
		// TODO Auto-generated method stub
		
	}

}
