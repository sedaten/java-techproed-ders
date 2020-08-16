package day19;

import java.util.Arrays;

public class Day19Array {

	public static void main(String[] args) {
		int arr[]= {3,7,1,18};
		//once arrays klasa git
		//Array elemanlarini kucukten buyuge siralama (sort)
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	//bir string array olusturun elemanlarini alp sirayla dizin
		String srr[] = {"Ali", "Veli","Deli", "Fadime"};
		Arrays.sort(srr);
		System.out.println(Arrays.toString(srr));
	
	int arr1[]= {2,5,9,4,7};
	Arrays.sort(arr1);
	System.out.println(Arrays.toString(arr1));
	System.out.println("En kucuk :"+ arr1[0]);
	System.out.println("En Buyuk : "+ arr1[arr1.length-1]);
	
	
	//Bir String array olusturup alf bastan sona yazdirin
	//ikinci elemanlari ekrana yazdirin
	String krr[]= {"Ahmet","Mehmet", "Can", "Dundar"};
	Arrays.sort(krr);
	System.out.println(Arrays.toString(krr));
	System.out.println(krr[1]);
	System.out.println(krr[krr.length-2]);
	//Bir elemanin Arrayda olup olmadigini kontrol etmek
	//nrr array'inde 7 elemaninin var olup olmadigini kontrol ediniz
	
	//1. yol: Loop ile
	int nrr[] = {2,3,5,7,9};

	int count = 0;
	
	for(int i = 0; i<nrr.length; i++) {
		if(nrr[i]==7) {
			count++;
		}
	if(count!=0) {
		System.out.println("7 eleman olarak var");
	}else {
		System.out.println("7 eleman olarak yok");
	}
	}
	//2.yol binarySearch()kullanarak.
	//===> a)Once KESINLIKLE sort() kullanmalisiniz
	Arrays.sort(nrr);
	//===>b)Aradiginiz eleman Array'de varsa binarySearch()
    //size o elemanin indexini verir	}
	System.out.println(Arrays.binarySearch(nrr, 7));//4
	/*
	 * binarySearch() methodu eleman array'de vor oldugunda 
	 asla negatif output vermez.
	 binarySearch() methodu eleman array'de yoksa negatif output verir
	 */
	
	
	System.out.println(Arrays.binarySearch(nrr, 6));
	//-5 verir."-"nin elemani yok demek
	//4 un anlami 6 olsaydi 4 uncu eleman olacakti.
	System.out.println(Arrays.binarySearch(nrr, 99));//-6
	
	//Note: Bir array'de tekrarli eleman varsa binarySearch() methodu eleman
	//nin var olup olmadigi hakkindaki dogru karar verebilir 
	//ama elemanin sirasi hakkinda bazen yanilir
	int mrr[] = {1, 3, 8, 3, 11};
	Arrays.sort(mrr);
	System.out.println(Arrays.binarySearch(mrr, 3));
	//1 veya 2 ama kesin sonuc yok
	
	}
}
