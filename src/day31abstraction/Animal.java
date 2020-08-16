package day31abstraction;

public abstract class Animal {
/* 
 1)abstrack soyut demektir. zit anlamlisi "concrete" dir. somut demek.
 2)Abstrack classlar Obj. üretemeyen classlardir. Cunku Obj. concretedir.
 Abstrack class soyuttur.
 3) Abstrackt class olusturarak 
 child classlari bazi seyler yapmaya MMMMECBURRR kilariz.
 4) abstrack class icerisinde olusturdugunuz abstracct methodlar 
 child classlar tarafindan uygulanmak ZZOOORUNDADIRR. 
 concrete class icine abstract method yazamayiz. 
 5) abstracct class'lar icine abstract olmayan methodlar yazabilirsiniz.
 Bu methodlar child class'lar tarafindan istege bagli olarak kullanilir.
 6) abstract larin body si olmaz.concreatlarda  body olmak zorundadir.
 cocuklara gore body olusturabiliriz.
 (abstract asi(), süt(){}
 
 */
	public abstract void asi();

	public abstract void drink();
	
	public void yemek() {
		System.out.println("yemek yerler");
	}
}
