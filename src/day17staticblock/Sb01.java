package day17staticblock;

public class Sb01 {
/* Farzedinki bu class dairenin cevre ve alanini hesaplayacak.
   Alan = pi*r*r      cevre= 2*pi*r
   Bu class'da pi sayisi her zaman kullanilacaktir. 
   Pi sayisina class uretirken deger atamasi yapmak faydalidir.
   Eger class uretirken bazi variablelera deger 
   atamasi yapilmasini isterseniz static block kullanmalisiniz.
   
   note: static block icinde kullanilan hersey static olmalidir.
   bu yuzden asagidaki ornekte"pi" variableini static yapmak zorundayiz.
   static block butun metot ve const.lardan once calisir.
   static block class olusturulurken calisir.
 */
	static double pi;
	Sb01(){
		System.out.println("Constructor");
	}
	static {
		pi = 3.14;
		System.out.println("Static block Ali");
	}
	
	public static void main(String[] args) {
	Sb01 obj1 = new Sb01();
	
	
	System.out.println("Main method");
	
	Sb01 obj = new Sb01();
	
	Sb01 obj2 = new Sb01();
	}
	
	static {
		pi = 3.14;
		System.out.println("Static block veli");
	
	
	
	}

}
