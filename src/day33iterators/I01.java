package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
		List<String>list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);//[X,Y,Z]
		//list1 icindeki her elemanin sonuna A ekleyin
		//Loop kullanarak list'*leri degistirwmwzsiniz
		for(String w : list1) {
			w= w + "A";
		}
		System.out.println(list1);//[XA,YA,ZA]
	
	//Bir List'i update etmek isterseniz iterator kullanmak lazim
		
	
	//1. Adim ListIterator obj olustur.
	
		ListIterator<String>li1 = list1.listIterator();
	
	//2. Adim while loop kullanin
	/*
	 1. hasNext() senden sonra eleman varmi varsa
	  true doner yoksa false doner ve loop kirilir.
	  2. next(): pointer'i bir sonraki elemana tasir ve ustunden 
	  atladigi elemani return eder.
	  3.set() : list icindeki elemanlari degistirmeye yarar
	 */
		while (li1.hasNext()) {
			Object element = li1.next();
			li1.set(element + "A");
		}
		System.out.println(list1);
	
	//String bir list olusturun her elemanin basina "K"sonuna "L" ekleyin.
		//yeni listi ekrana yazdirin.
		List<String>list2 = new ArrayList<>();
		list2.add("A");
		list2.add("E");
		list2.add("O");
	
	ListIterator<String>li3 = list2.listIterator();
	while(li3.hasNext()) {
		Object element = li3.next();
		li3.set("K"+element + "L");
	}System.out.println(list2);
	
	}

}
