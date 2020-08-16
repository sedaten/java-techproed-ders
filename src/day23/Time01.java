package day23;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time01 {

	public static void main(String[] args) {
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);//21:21:54.895===>895 nanosecond
	
		//Zamanda ileri nasil gidilir?
		System.out.println(lt.plusMinutes(7));//21:30:54.596
		System.out.println(lt.plusHours(6));//03:25:19.644
	
		//Zamanda nasil geri gidilir?
		System.out.println(lt.minusSeconds(23));//21:26:51.398
		//Time formati nasil degistirilir?
		//hh===> 12 lik sistem kull     HH===>24 luk sistem kull.
		//h===> mesela 03 basmaz 3 basar
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf1.format(lt));//09:29
	
		//Farkli ulkelerdeki yerel saatinasil yazdirabilirim?
		System.out.println(LocalTime.now(ZoneId.of("Turkey")));//22:34:45.141
		System.out.println(LocalTime.now(ZoneId.of("Japan")));//04:36:24.689
		System.out.println(LocalTime.now(ZoneId.of("Europe/Moscow")));//22:38:19.463
	}

}
