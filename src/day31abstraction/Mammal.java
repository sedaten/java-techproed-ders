package day31abstraction;

public abstract class Mammal extends Animal {

	/*
	 1) Mammal Animalin child classi ve asi methodu ile 
	 drink methodunu override etmedi ama herhangi bir cte yok. Cunku 
	 abstrack child larin abstack parentdaki abstract methodlari 
	 override etme zorunlulugu yoktur. 
	 */
	public abstract void feed();
	
	public void move() {
		System.out.println("Hareket ederler");
	}
}
