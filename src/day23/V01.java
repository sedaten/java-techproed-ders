package day23;

public class V01 {
/*
 Varargs : (Variable Arguments) Varargs normalde bir array'dir. 
 Ama uzunlugu kullanicinin girdigi deger sayisina gore buyur. 
 Varargs dipsiz kuyu gibidir icine ne atarsan sonsuza kadar kabul eder.
 1)Varargstan sonra baska parametre kullanilamaz. Varargs method parantezi
 icerisinde her zaman en sonuncu olmalidir.
 2)Varargs sonda olduktan sonra Varargs'in 
 oncesinde Varargs olmayan parametreler kullanilabilir
 3) 
 */
	public static void main(String[] args) {
		
		add(3, 5);//8
		add(3,5,2,4,9,6,5,4,7,1,2,5,7);
		product(1,2,4,53,5,4,4,5,8);
	}
	
/*	public static void add(int s1, int s2) {
		System.out.println(s1+s2);
	}
	*/
	//ne girilirse toplamini yazacak
	public static void add(int... x) {
		int sum = 0;
		for(int w:x) {
		sum = sum + w;
		}System.out.println(sum);//60
	}
// Ne girilirse ekrana carpimini yazacak
	public static void product(int...y) {
		int pro = 1;
		for(int w:y) {
			pro = pro * w;
		}System.out.println(pro);//1356800
	}

	// Homewoek: Kelimenin herflerini alip 
	//onlari giris sirasina gore birlestirerek ekrana basan pro yaziniz.
	//Varargs kullaniniz











}
