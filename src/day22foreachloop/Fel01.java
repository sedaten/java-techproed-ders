package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class Fel01 {

	public static void main(String[] args) {
	
		List<Integer> il = new ArrayList<>();
		il.add(21);
		il.add(22);
		il.add(23);
		il.add(24);
		il.add(25);
		il.add(26);
		
	//for-each loop = Enhance loop(Elemanlarin data type paranteyz icine)
	//for each loop Arraylarde kullanilmaz.	
		for(Integer w : il) {
		System.out.println(w);	
		}
		int sum =0;
		for(Integer w : il) {
			sum= sum + w;
		}
		System.out.println(sum);
		
		//il listinin icindeki tek sayi olan elemanlarin carpimini bulunuz
		
		int product=1;
		for(Integer w : il) {
			if(w%2!=0) {
				product= product*w;
			}
		}System.out.println(product);
	
	
	for(int w : il) {
		if(w%2!=0) {
			System.out.println(w);
		}
	}
	
	//Break ve continue karsilastirmasi
	
	//il list'inin ilk 3 elemanini yaziniz
	System.out.println("================");
	int count =0;
	
	for(int w : il) {
		
		if(count<3) {
			System.out.print(w+" ");
			count++;
	}
	}
	System.out.println("==============");
	//2.Yol
	int c = 0;
	for(int w : il) {
		System.out.print(w+ " ");
		c++;
		
		if(c==3) {
			break;
		}
	}
	System.out.println("=================");
	//il list'inde 3 ile bölunebilenleri ekrana yazdiriniz
	//1.Yol
	for(Integer w : il) {
		if(w%3==0)
			System.out.print(w+ " ");
	}
	
	//2.Yol
	for(int w:il) {
		if(w%3!=0) {
			continue;
		}else {
			System.out.println(w+" ");
		}
	}
	System.out.println("======================");
	for(int w:il) {
		if(w%3!=0) {
			continue;
		}
			System.out.println(w+" ");
	}
	
	}

}
