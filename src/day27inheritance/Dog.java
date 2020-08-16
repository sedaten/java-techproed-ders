package day27inheritance;

public class Dog extends Mammal {
/*
 1)Java'da bir class sadece bir class'a extend edebilir.
 Java'da bir class'in sadece bir tane parent'i olabilir.
 Java multible inheritance'i onaylamaz.
 2)protected ve public method'lar inheritance'a uygundurlar.
 private method'lar inheritance'a uygun degildirler.
 default ayni package'da iseniz inheritance'ye uygundur ama farkli 
 package'da iseniz uygun degildir. Kullanmak risklidir. bu yuzden 
 inheritance'da default access modifier kullanilmaz.
 (Not: parent class super classdir)(Super yazsanda olur yazmasanda)
 3)Parents Class = Super Class
 	Child Class = Sub Class
 4)Her constructor'in ilk satirinda aksi bir hamle yapilmadikca super()
 constructor call'u vardir. super() yazmak istege baglidir.
 */
	
	public boolean loyal = true;
	public Dog() {
		super();
		System.out.println("Dog");
	}
	public static void main(String[] args) {
	
				Dog dog = new Dog();
				dog.bark();
				dog.drink();
				Mammal.feed();
				dog.smell();
System.out.println("Sadik? "+ dog.loyal);
System.out.println("Dogum? "+ dog.dogum);			
System.out.println("Yas? "+ dog.age);
	}
			public  void bark() {
				System.out.println("Havlarlar");
			}
			
			public  void smell() {
				System.out.println("Iyi koku alirlar");
			}
		

	}


