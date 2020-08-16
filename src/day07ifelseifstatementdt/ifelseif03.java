package day07ifelseifstatementdt;

import java.util.Scanner;

public class ifelseif03 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Yasinizi giriniz");
		byte yas = scan.nextByte();
		
		if (yas<0) {
			System.out.println("Yas negatif olamaz.");
		}else if (yas<13) {
			System.out.println("Calisamaz");
		}else if(yas<65) { 
			System.out.println("Calisabilir");
		}else{System.out.println("Emekli");
		}
		scan.close();
	}
}


