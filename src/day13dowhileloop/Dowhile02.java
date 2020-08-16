package day13dowhileloop;

import java.util.Scanner;

public class Dowhile02 {

	public static void main(String[] args) {
		/*Kullanicidan  bir sayi alin sayi cift sayi ise kullanici ekrana kazandiniz yazdirin
		tek sayi ise kaybettiniz yazdirin ve yeni bir sayi isteyin*/
		
		Scanner scan = new Scanner(System.in);
		int s = 12;
		do {
			if(s%2!=0) {
			System.out.println("Kaybettiniz");
			}
			System.out.println("Birsayi giriniz");
			s= scan.nextInt();
			}while(s%2!=0);
		System.out.println("kazandiniz");
		scan.close();
	}

}
