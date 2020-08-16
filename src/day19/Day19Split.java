package day19;

import java.util.Arrays;

public class Day19Split {

	public static void main(String[] args) {
		//Split ayirir parca parca
		//Bir String'i parcalara ayirmak
		//virgulden kesince virgulde gider, olur
		String str = "Ipek topu at, topu at Ipek";
		
		
		String[] strArray = str.split(",");
		System.out.println(Arrays.toString(strArray));
		//[Ipek topu at, topu at Ipek] , arrayin virgulu
		
		// str stringinde kac kelime var?
		String sArray[] = str.split(" ");
		System.out.println(Arrays.toString(sArray));
		System.out.println(sArray.length);//6
	
		String tArray[] = str.split("");//Bu kod space dahil tum karakterleri ayirir.
		System.out.println(Arrays.toString(tArray));
	//[I, p, e, k,  , t, o, p, u,  , a, t, ,,  , t, o, p, u,  , a, t,  , I, p, e, k]
	
	}

}
