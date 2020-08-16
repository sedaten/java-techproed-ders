package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda01 {

	public static void main(String[] args) {
		
		//Multi dimensional array nasil olusturulur?
		//3 distaki tepsi(index'i 0,1,2) 2 icteki tepsiler(index'i 0,1).
		//ilk parantezler distaki tepsi,2 nci par. ictekiler icin
		int mda[][] = new int[3][2];
		//eleman yerlestirme ikinci tepsinin ilk elemani na 7 yazalim
		mda [1][0] =7;
		//Multi dimentional arraylari konsola yazdirma
		System.out.println(Arrays.deepToString(mda));//[[0, 0], [7, 0], [0, 0]]
	
	mda[2][0]=11;
	System.out.println(Arrays.deepToString(mda));
	mda[0][1]=23;
	System.out.println(Arrays.deepToString(mda));
	mda[0][0]=10;
	mda[1][1]=12;
	mda[2][1]=55;
	System.out.println(Arrays.deepToString(mda));
	//Multi dimensional arraylerde istenen elemani yazmak
	System.out.println(Arrays.toString(mda[0]));//[10, 23]
	System.out.println(Arrays.toString(mda[1]));
	System.out.println(Arrays.toString(mda[2]));
	
	System.out.println(mda[0][0]);//10
	System.out.println(mda[1][1]);//12
	System.out.println(mda[2][0]);//11
	
	//Multi dimensional array olusturmanin kisa yolu nedir?
	char mdac[][] = {{'a','b','c'},{'d'},{'e','f'},{'g','h','i','k'}};
	//Yani Arrtay olusturmanin 2 yolu var kisa ve uzun yol
	//Soru:Yukaridaki mda daki ilk arrayin elemanlarinin ascii deger topl 
	//yazdirin.
	//1.Yol
	System.out.println(mdac[0][0]+mdac[0][1]+mdac[0][2]);//294
	//2.Yol
	int sum=0;
	for(int i=0; i<mdac[0].length; i++) {
		sum= sum+mdac[0][i];
		}
	System.out.println(sum);//294
	
	
	}

}
