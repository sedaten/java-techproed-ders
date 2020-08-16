package day13dowhileloop;

import java.util.Scanner;

public class dowhile03 {

	public static void main(String[] args) {
		/* Kullanicidan bir string alin
		  stringin icinde kucuk a varsa kazandiniz yazdirin
		  yoksa kaybettiniz yazdirin ve yeni string isteyin
		 */

		Scanner scan =new Scanner(System.in);
		String k = "a";
		do {
			if(!k.contains("a")) {
				System.out.println("Kaybettiniz");
			}
			
			
			System.out.println("Bir kelime giriniz");
			
			k= scan.nextLine();
		
		
		}while(!k.contains("a"));
		
		System.out.println("Kazandiniz");
	
	}
	

}
