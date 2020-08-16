package day31abstraction;

public class Cat extends Mammal {

	/*
	1) Concreat classlar parentleri olan abstracct classlardaki 
	tum abstract methodlari override etmek zorundadir. Aksi takdirde
	cte olusur.
	2)Concrete class'lar parentleri olan abstract class'lardaki
	 concrete methodlari
	*/
	
	public static void main(String[] args) {
		

	}

	@Override
	public void asi() {
		System.out.println("Ey kedi igne ol");
		
	}

	@Override
	public void drink() {
		System.out.println("Su ic");
		
	}

	@Override
	public void feed() {
		System.out.println("Yavrularini besle");
	}

}
