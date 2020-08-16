package day09nestedternary;

import java.util.Scanner;

public class nestedternary02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("uc kenar uzunlugunu girin");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		
		String result = k1==k2 && k2==k3 ? k1*3>=30 ? "Ne buyuksun" : "Normal" 
			: k1+k2+k3<=20 ? "Ne kucuksun" : "Normal";
		System.out.println(result);
		scan.close();
	}
	

}
