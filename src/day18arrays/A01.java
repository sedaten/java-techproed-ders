package day18arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
	//Bir array'i consola yazdirmak icin Arrays.toString() kullaniriz.
		int arr1[] = new int[3];
		System.out.println(Arrays.toString(arr1));
	//Bir array'e eleman ekleme====>son eleman 11 olsun.
		arr1[2] = 11;
		System.out.println(Arrays.toString(arr1));
	
	arr1[1] = 9;//orta eleman 9 olan arry
	System.out.println(Arrays.toString(arr1));
	
	arr1[0] = 7;//ilk eleman ekleme
	System.out.println(Arrays.toString(arr1));
	//arr1[3] =13;// hata verir.
	//Bir arrayda olmayan indexi kullanmaya calisirsan 
	//Run Time Error verir.consolda gorursun. Kirmizi alt cizgi olmaz.
	//java.lang.ArrayIndexOutOfBoundsException: 3 hatasi verir.
	//kisa yoldan array olusturup deger atama
	int arr2[] = {8, 10, 12, 14};
	//boyutunu anliyor java boyut yazmadik.
	//Bir array deki belli bir elemani ekrana yazdirmak
	System.out.println(arr2[1]);//10
	System.out.println(arr2[3]);//14
	System.out.println(arr2[0]);//8====> ilk eleman arrismi[0] ile yazdirilir.
	//herarraydeki son elemani yazdir
	System.out.println(arr2[arr2.length-1]);
	int arr3[] = {21, 22, 23, 24, 25, 26, 27};
	System.out.println(arr3[arr3.length-1]);
	
	//Bir arraydeki tum elemanlari yazdirma
	
	int arr4[] = {20 ,21, 22, 23, 24,25,26};
	for(int i=0;i<arr3.length;i++ ) {
	System.out.print(arr4[i]+" ");
	}
	
	//Bir array daki indexi cift olanlari yazdirmak
	
	int arr5[] = {1,2,3,4,5,6};
	int i=0;
	while(i<arr5.length) {
	if(i%2==0) {
	System.out.print(arr5[i] +" ");
	}
	i++;
	}
	
	
	}

}
