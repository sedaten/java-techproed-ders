package day25encapsulation;

public class E01 {
/*Bisey olusturup icine saklama.Kapsulleme
Data'yi saklamak.
1) Encapsulation: Data saklama(Hiding) demektir.
neden saklanir degistirilmesi diye
2)Encapsulation icin variable'lari "private" yapariz.
biseyi tamamiyle kapsullemek de lazim oldugundada bilgi veririz.
3) Encapsulation yaptigimiz variable'i a)Okumak B)Degistirmek icin acabiliriz	
4)okumak icin getter degistirmek icin setter yapariz nasil settr
*/

	private int sifre = 123456;
	private String isim = "Ali Can";
	private int pin = 1453;
	
	public static void main(String[] args) {
	
	}
	//Encapsulation yaptiginiz variablenin baska class'larda 
	//okunabilmesi icin isterseniz getter method olusturmaniz gerekir.
	// nasil olusturulur Kesinlikle public tur isim mutlaka 
	//getle baslayan sifre isimi olur.
	//AccessModifier Public
	//ReturnType variable'nin return type'i ile ayni olsun.
	//Isim get+variable ismi yazilsin
	//Method 
	public int getSifre() {
		return sifre;
	
	}
	public String getisim() {
		return isim;
	}
//1 variable olusturup encapsulation yapiniz 
	// bu variablenin diger classlarda okunabilmesi icin gerekenbi apini
	// bu variableyi diger classlarda okuyubuz

	public int getpin() {
		return pin;
	}
//Setter yapmak public sonra void , void de return olmaz. 
//()paranteyz icine int sifre. This prantezliyse constructer. olmadiginda
//bu class'taki
	
	/*
	1) Accsess Modifier'i public yapiniz.
	2)Return type'i her zaman void yapiniz
	3)
	*/
	public void setSifre(int sifre) {
		this.sifre = sifre;	
	}
public void setpin(int pin) {
	this.pin= pin;
}
public void setisim(String isim) {
	this.isim= isim;
}

}
