package day06ifstatementdt;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir sayi giriniz");
	int num = scan.nextInt();
	
	if (num>=10 && num<=99) {
		System.out.println("iki basamakli sayi");
		}else {
			System.out.println("Iki basamakli degil");
		}
		scan.close();
	}
}

