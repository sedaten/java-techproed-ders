package day07ifelseifstatementdt;

import java.util.Scanner;

public class Ifelseif02 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir harf giriniz.");
		char h = scan.next().charAt(0);
		
		if (h=='a'|| h=='A') {
			System.out.println("Ilk harf");
		}else if (h=='b'|| h=='B') {
			System.out.println("Ikinci harf");
		}else if (h=='c'|| h=='C') {
			System.out.println("ucuncu harf");
		}else {System.out.println("Sirasini bilmiyorum.");
		
		}
		scan.close();

	}

}
