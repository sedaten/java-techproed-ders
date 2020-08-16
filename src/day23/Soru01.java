package day23;

import java.util.ArrayList;
import java.util.List;

public class Soru01 {

	public static void main(String[] args) {
		//Iki string list olustur ve bu list'lerdeki ortak
		//elemanlari for-each loop kullanarak bulunuz.Sunucu ekrana yazdir.

		List<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		
		List<String> l2 = new ArrayList<>();
		l2.add("X");
		l2.add("B");
		l2.add("Y");
		l2.add("D");
		
		int count = 0;
		for(String w : l1) {
			for(String z : l2) {
				if(w.equals(z)) {
					System.out.println(w);
					count++;
				}
			}
			
		}
	if(count==0) {
		System.out.println("Ayni eleman yok");
	}
	}

}
