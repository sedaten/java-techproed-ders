package day27inheritance;

public class Car extends Vehicle {
//Vehiclede yani parentste default yerine parametreli const var. parametreli
//const. bulamazsa car const kizar ncozum asagida goruluyor.
/*	
 super() ile parentdan constroctor calistirirken parametrelere dikkat edin
 Parents class'da olmayan bir consti super() ile ncagirirsan CTE alirsíniz.
 this bu class daki const icin demek	
 this()* Class icindeki const parametrelere gore cagirmak icin kullanilir.
 Const. cagirmalar ilk satirda olur. Yoksa CTE oluz(Ister this ile ister super)
 super ve this ayni cont kullanilamaz cunku biri ikinci olur.
 Not( methodlar const gore secilir
 (Aranan method cont 
 (Metod secerken const bakin variable secerken data tipine bakin.
 */
	
	public Car() {
		super(2);
		
		System.out.println("Car");
	}
	public Car(String name) {
		this();
		System.out.println("Car");
	}
	public static void main(String[] args) {
		
		Car car = new Car("Honda");
	}

}
