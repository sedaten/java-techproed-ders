package day06ifstatementdt;

import java.util.Scanner;

public class ifstatement04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int num = scan.nextInt();
		
		if(num>=0 && num<=9) {
			System.out.println("Rakam");
		}
		if(num>9 && num<100) {
			System.out.println("Iki basamakli sayi");
		}
		scan.close();
	}

}
