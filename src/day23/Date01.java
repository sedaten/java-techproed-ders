package day23;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date01 {
	/*
	 1)Anlik tarihi almak
	 2)Tarihi ilerletmek veya geriletmek
	 3)Tarihi farkli formatla yazmak 
	 */

	public static void main(String[] args) {
	 //Anlik atrih nasil alinir
		LocalDate ld = LocalDate.now();
	System.out.println(ld);//2020-07-21
	//275 gun sonrasinin tarihi ekrana nasil yazdirilir?
	System.out.println(ld.plusDays(275));//2021-04-22
	System.out.println(ld.plusMonths(3));//2020-10-21
	System.out.println(ld.plusYears(3));//2023-07-21
	// Gecmis tarihi ekrana yadirmak nasildir?
	System.out.println(ld.minusDays(34));//2020-06-17
	System.out.println(ld.minusMonths(6));
	//Tarihi nasil farkli formatta yazdirabiliriz?
	DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	dtf1.format(ld);
	System.out.println(dtf1.format(ld));//21/07/2020
	
	//MM kacinci aysa
	//MMM yazarsan ayin ilk 3 harfini yazar.
	//MMMM yazaesan tamamini yazarsin
	
	
	//d===>10 dan kucuk gunler icin tek rakam basar
	//ama 10 ve yukarisi icin cift rkam basar
	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM.dd.yy");
	System.out.println(dtf2.format(ld));//Jul.21.20

	
	}

}
