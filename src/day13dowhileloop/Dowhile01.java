package day13dowhileloop;

import java.util.Scanner;

public class Dowhile01 {

	public static void main(String[] args) {
		//Kullanicidan sayi alin bu sayiyi 10 dan buyuk ise ekrana kazandiniz yazdirin
		//sayi 10 veya 10 dan kucuk ise ekrana kaybettiniz yazip tekrar sayi isteyin
		
		Scanner scan = new Scanner(System.in);
		int s = 20;
		do {
			if(s<=10) {
				System.out.println("Kaybettiniz");
			}
			System.out.println("Bir sayi giriniz");
			s = scan.nextInt();
		}while (s<=10);
		System.out.println("Kazandiniz");
		scan.close();
	}

}
