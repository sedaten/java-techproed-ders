package day27inheritance;



public class Bird extends Animal {

		public boolean kanat = true;
	public Bird () {
		System.out.println("Bird");
	}
		public static void main(String[] args) {
		Bird ob = new Bird();
		ob.drink();
		ob.eat();
		ob.fly();

	}
	public void fly() {
		System.out.println("Ucarlar");
	}


	}


