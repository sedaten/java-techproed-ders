package day28overriding;

public class Cat extends Animal{

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();

	}
	public void sound() {
		System.out.println("Miyavlar");
	}
	@Override//Annotation: Bu asagidaki methodun override kurallarina uygun
							//olarak override edilip edilmedigini kontrol eder.
	public void numOfFoot() {
		System.out.println("4 ayaklari vardir");
	}
}
