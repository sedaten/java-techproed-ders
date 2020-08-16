package day09nestedternary;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("gun numarasini girin");
		int nr = scan.nextInt();
		
		switch (nr) {
		case 1:
			System.out.println("Pazar");
			break;
		case 2:
			System.out.println("Pazartesi");
			break;
		case 3:
			System.out.println("Sali");
			break;
		case 4:
			System.out.println("Carsamba");
			break;
		case 5:
			System.out.println("Persembe");
			break;
		case 6:
			System.out.println("Cuma");
			break;
		case 7:
			System.out.println("Cumartesi");
			break;	
		default:
			System.out.println("Gecerli gün sayisi giriniz.");
		}scan.close();
	}

}
