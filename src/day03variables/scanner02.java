package day03variables;

import java.util.Scanner;

public class scanner02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam isminizi giriniz.");
		String tamIsim = scan.nextLine();
		System.out.println(tamIsim);
		System.out.println("Yasinizi giriniz.");
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("Isminizin ilk harfini giriniz.");
		char ilkHarf = scan.next().charAt(0);
		System.out.println(ilkHarf);
		
		System.out.println("cocuk sayinizi giriniz.");
		byte cocuk = scan.nextByte();
		System.out.println(cocuk);
		
		scan.close();

	}

}
