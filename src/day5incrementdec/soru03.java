package day5incrementdec;

import java.util.Scanner;

public class soru03 {

	public static void main(String[] args) {
		// Kullanicidan 3 basamakli bir sayi aliniz
				// Bu sayinin rakamlari toplamini ekrana yazdiriniz
				
				Scanner scan = new Scanner(System.in);
				System.out.println("3 basamakli bir sayi giriniz");
				int s = scan.nextInt();
				
				int sonRakam = s%10;
				
				int ortaRakam = (s/10)%10;
				
				int ilkRakam = (s/100)%10;
				
				System.out.println(ilkRakam+ortaRakam+sonRakam);
	}

}
