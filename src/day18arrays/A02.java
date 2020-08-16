	package day18arrays;

import java.util.Arrays;

public class A02 {

	public static void main(String[] args) {
		//iki array olusturunuy lengthi ayni olsun. 
		//bu arraylarin tum elemanlari ayni ise ekrasna ayni yadir farkliysa farkli yazdir

	/*	int arr[] = {1,2,3,4,5};
		int arr1[] = {1,2,3,4,5};
		
		if(arr[arr.length-1]==arr1[arr1.length-1]) {
			System.out.println("ayni");
			}else {
				System.out.println("Farkli");
			}
	*/
	// 2nci yol
	/*	char ch3[] = {'a', 'd', 'c', 'k'};
		char ch4[] = {'a', 'd', 'c', 'k'};
		int t = 0;
		
		for(int i=0; i<ch3.length; i++) {
			if (ch3[i]==ch4[i]) {
				t++;
			}
			if(t==ch3.length) {
				
		System.out.println("Ayni");
			}else {
				System.out.println("Farkli");
			}
		}
		if(Arrays.equals(ch3, ch4)) {
			System.out.println("Ayni");
		}else {
			System.out.println("farkli");
		}
		*/
		//Length'i ayni olan iki array olusturunuz bu array'lerin tum elemanlari ayni ise 
				//ekrana "Ayni" yazdirin farkli ise ekrana "Farkli" yazdirin. (loop kullanin)
				char ch1[] = {'a', 'd', 'c', 'k'};
				char ch2[] = {'a', 'd', 'k', 'c'};
				int z = 0;
				
				//1.Yol​
				
				for(int i=0; i<ch1.length; i++) {			
					if(ch1[i] == ch2[i]) {
						z++;
					}	
				}		
				if(z==ch1.length) {
					System.out.println("Ayni");
				}else {
					System.out.println("Ayni degil");
				}
				
				//2. Yol
				if(Arrays.equals(ch1, ch2)) {
					System.out.println("Ayni");
				}else {
					System.out.println("Ayni Degil");
				}
	}

}
