package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
		List<String> sl = new ArrayList<>();
		sl.add("Ali");
		sl.add("Kemal");
		sl.add("Ayse");
		
		// Bir elemani degistirme
		sl.set(0, "Aliye");
		System.out.println(sl);//[Aliye, Kemal, Ayse]

	//Bir elemanin varligini kontrol etme?
		System.out.println(sl.contains("Kemal"));//true
		System.out.println(sl.contains("WWWWW"));//false
	//Bunlari ezberlemeli
	// Elemanlari natural order'a gore nasil dizilir?
	//(Kucukten buyuge + Alfabetik sira
	Collections.sort(sl);//<===Cok kullanilir
	System.out.println(sl);//[Aliye, Ayse, Kemal]
	  
	
	//Elemanlari natural order'a gore siralama nasil yapilir?
	Collections.reverse(sl);
	System.out.println(sl);//[Kemal, Ayse, Aliye]
	
	//List'deki elemanlarin tamamini nasil sileriz?
	sl.clear();//<===Cok kullanilir.
	System.out.println(sl);//[]
	
	/*Iki list'in esit olup olmadigini nasil kontrol ederiz?
	Listler ASLA Primitivler ile calismazlar. bu yuzden
	Kullanicilar primitilerin yanina method iste
	yince java da 
	wrapperleri yapti.args Bunlar non Pri gibi olur buyuk harfle yazariz.
	List<int> hata verir. List<Integer> yazilmali
	
	Her primitivin data type'inin bir WRAPPER CLASS'i vardir.
	Primitive   Wrapper Class
	boolean  ==> Boolean
	char    ===> Character
	byte    ===> Byte
	short   ===> Short
	int     ===> Integer
	long  =====> Long
	float =====> Float
	double ====> Double
	*/
	//Iki list'in esit olup olmadigini nasil kontrol ederiz?
	List<Integer>il1 = new ArrayList<>();
	il1.add(12);
	il1.add(13);
	il1.add(14);
	
	List<Integer>il2 = new ArrayList<>();
	il2.add(12);
	il2.add(12);
	il2.add(12);
	
	System.out.println(il1.equals(il2));//Esitse true, degilse false verir.
	//Hem elemanleri hem de elemanlarin yerlerini kontrol eder.

	}
}
