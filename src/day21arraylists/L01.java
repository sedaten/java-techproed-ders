package day21arraylists;

import java.util.List;

import java.util.ArrayList;

public class L01 {
	//Cok onemli cok kullanilir.Arraylerin gelismis hali
		//List i kullanmak kolaydir. metodlari cok.
			//Array'dan en onemli farki:Arrayda boyut mutlaka soylenmeli
			//ama listlerde uzunluk otomatik ayarlanir.Ve Listler ASLA primitiv
			//ile calismaz. Primitive ile INTEGER vs. yazarak kullanilabilir
	     
			
	
	/*
	     	1)Array'larin uzunluklari en basta belirlenir ve bir daha 
			 degistirilemez. List(ArrayList)'lere ise List olusturulurken uzunluk 
			 belirlemeye gerek yoktur.Cunki List'ler 
			 eleman eklendikce kendilerini buyuturler eleman sildikce kuculurler.
			 2)List'ler cok kullanisli method'lara sahiptir. Bu yuzden array'lere
			 tercih edilir.
			 3)Arrayler Primitive ve referanslari eleman olarak kabul ederler
			 Ama List'ler sadece non-Primitiv'leri eleman olarak kabul eder.
			 */
		
	public static void main(String[] args) {
		
	//List olusturma nasil yapilir?
	//1. Yol:
	ArrayList<String>sl = new ArrayList<String>();
	//2.Yol:
	ArrayList<String>sl2 = new ArrayList<>();
	//3.Yol:
	List<String>sl3 = new ArrayList<>();
	
	sl3.add("A");
	System.out.println(sl3);//[A]
	
	sl3.add("B");
	System.out.println(sl3);//[A, B]
	
	sl3.add("C");
	System.out.println(sl3);//[A, B, C]
//Herhangi bir index'e eleman ekleme nasil yapilir?
	sl3.add(1, "X");//[A, X, B, C]
	System.out.println(sl3);
	sl3.add(0, "Mustafa");
	System.out.println(sl3);//[Mustafa, A, X, B, C]
	
	//List'lerde eleman sayisini bulma nasil yapilir?
	System.out.println(sl3.size());//5
	
	//Bir List'in bos olup olmadigini anlama 
	System.out.println(sl3.isEmpty());//bos ise true 
									  //dolu ise false
	//Bir list'ten istenen elemani silme
	//1. Yol: index ile silme yapabilirsiniz.
	sl3.remove(0);
	System.out.println(sl3);
	//2. Yol: Eleman secip sil
	sl3.remove("X");
	System.out.println(sl3);// [A, B, C]
	
	sl3.add("B");//[A, B, C, B]
	sl3.remove("B");//Ayni eleman varsa ilkini siler
	System.out.println(sl3);//[A, C, B]
	
	sl3.remove("W");
	//Java'da olmayan bir eleman etmesini isterseniz
	//remove edemez ve List'i aynen verir.
	System.out.println(sl3);//[A, C, B]
//remove() icine sayi yazarsak java onu index kabul eder. o yuzden 
	//****integer listler sadece index ile silinebilir.******
	//remove(index) ne return eder?(elemani verir kontrol icin)
	//sl3===>[A, C, B]
	System.out.println(sl3.remove(1));//C
	System.out.println(sl3);//[A, B]
	
	//remove(eleman) ne return eder?(Eleni sildim diye true verir
	//sl3==>[A, B]
	System.out.println(sl3.remove("A"));//true
	System.out.println(sl3);//[B]
	}
}
