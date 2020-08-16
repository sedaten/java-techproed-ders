package day28overriding;

public class Dog extends Animal{

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
	}
	public void sound() {
		System.out.println("Havlarlar");
	}
	@Override
	public void numOfFoot() {
	System.out.println("4 ayaklari vardir");
	}
}
