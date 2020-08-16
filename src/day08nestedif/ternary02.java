package day08nestedif;

import java.util.Scanner;

public class ternary02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin kenar uzunluklarini giriniz");
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		int kenar3 = scan.nextInt();
		String result = kenar1==kenar2&&kenar1==kenar3&&kenar2==kenar3 ? "Eskenar" : "Eskenar degil";
		System.out.println(result);
		scan.close();
	}

}
