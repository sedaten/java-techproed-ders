package day22foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L01 {

	public static void main(String[] args) {
		//Bir Array'i nasil list'e ceviririz?
		String s[] = {"A", "B","C"};//Array
		
		List<String>sl = new ArrayList<>();//List
		//Bir array'i nasil list'e ceviririz?
		sl = Arrays.asList(s);
		System.out.println(sl);//[A, B, C]
		
		//Bir List nasil Array'e cevrilir?
		//Object (Hz.Adem gibi)butun classlarin babasi
		/*Javada her class'in en az bir Parent'i vardir. Parenti olmayan tek
		 class Object class'dir.
		 Object tüm class'larin ortak babasidir
		 */
		Object[] listtenArray = sl.toArray();
	}

}
