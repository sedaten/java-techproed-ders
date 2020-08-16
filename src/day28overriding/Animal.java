package day28overriding;

public class Animal {
	/*"Biz bazen Parentteki metodu body i degistirmek isteriz. Buna overriding denir. "
	  1)Parents'taki method'u method signature'ini degistirmeden method body
	  sini degistirerek Child class'da kullanmaya "Method Overriding"denir. 
	 2)Parents class'daki private methodlar override edilemezler. 
	 3)final method'lar override edilemezler cunku; final methodlarin bodyleri
	 olabilecekleri son haldedir yani method bodyler degistirilemez.Halbuki
	 overriding'in amaci method body'i degistirerek methodu kullanmaktir.
	 Bu celiskiden dolayi Java final metodlarin override edilmesine musaade etmez.
	 4)static method'lar override edilemezler.Cunku; static methodlar ortak kullanim
	a aciktir. onun bodysini degistirmek herkesi etkiler. Bu yuzden 
	java static methodlarin override edilmesine musaade etmez.
	5)Child class'daki override edilmis methodun (Overriding Method) acc mod
	parents class'daki override edilen metodun (Overridden Method acc mod
	indan daha dar olamaz.
	6) Child class'daki override edilmis methodunreturn type ile
	7)Primitive data type kullanilan methodlarda mecburen ayni data type kullanabiliriz(
	/void ve primitive)
	 */
	public void sound() {
		System.out.println("Ses cikarirlar");
	}
	public void numOfFoot() {
		System.out.println("Ayak sayisi bellidir");
	}
	public Animal myMethod() {
		
	}
public Animal myMethod () {
	Animal obj1 = new Animal();
	return null;
}
}

