package day24accessmodifierstringbuilder;

public class Sb01 {
/*
 1)String class her degisim icin yeni bir String olusturur.
 var olan String'i degistirmez. 
 Bu yuzden String'ler "immutable"(Degistirilemez) dir denir.
 StringBuilder ise degisime aciktir, 
 yeni String olusturmadan var olani degistirmek mumkundur.
 String Builder'lar "mutable "Degistirilebilir" demektir. 
 
 */
	public static void main(String[] args) {
	//StringBuilder ile String olusturmak icin 3 farkli yol vardir.
	//1.Yol
	StringBuilder stb1 = new StringBuilder();
	System.out.println(stb1);
	
	stb1.append("Java");
	System.out.println(stb1);//Java
	
	stb1.append("Java Kolaydir");
	System.out.println(stb1);//JavaJava Kolaydir
	
	//2. Yol(Degisime aciktir. 5 yazsanda sorun olmaz
	StringBuilder stb2 = new StringBuilder(5);
	stb2.append("Ali");
	
	stb2.append("Kazandi");
	System.out.println(stb2);//AliKazandi
	//3. Yol 
	StringBuilder stb3 = new StringBuilder("Java");
	System.out.println(stb3);
	/*
	1) ucuncu yol ile bir String olusturun 
	bu Stringe ekleme yapin
	bu stringin beklli bolumunu ekrana yazdirin*/
	
	StringBuilder stb4 = new StringBuilder("hava");
	stb4.append("guzel");
	System.out.println(stb4);//havaguzel
	stb4.delete(2, 5);
	System.out.println(stb4);//hauzel
	System.out.println(stb4.substring(1, 4));//auz
	stb4.append("hava").append("Hmmmmm");//method chain (Zincir)
	System.out.println(stb4);//hauzelhavaHmmmmm
	System.out.println(stb4.charAt(3));//z
	System.out.println(stb4.delete(4,9));//HauzaHmmmmmm
	stb4.getClass();//Obje ya hangi classtan olusturuldugunu soyler
	System.out.println(stb4.getClass());//class java.lang.StringBuilder
	System.out.println(stb4.indexOf("Hmmmm"));//5 (Ilk harfin indexi)
	
	System.out.println(stb4.insert(4, ";;"));//hauz;;aHmmmmm
	System.out.println(stb4.insert(2, "v"));//havuz;;aHmmmmm
	
	System.out.println(stb4.lastIndexOf("a"));//7
	System.out.println(stb4.length());//14
	System.out.println(stb4.replace(5, 13, ""));//havuzm
	
	
	
	
	//Stringi tersten yazdirma loop ile(Interviev sorusu)
	String s = "";
	for(int i = stb4.length()-1; i>=0; i--) {
		s = s + stb4.charAt(i);
	
	}
	System.out.println(s);//mzuvah
	
	
	//Stringi tersten yazdirma StringBuilder kullanarak
	stb4.reverse();
	System.out.println(stb4);//mzuvah
	
	
	stb4.setCharAt(0, 'A');
	System.out.println(stb4);//Azuvah
	//capacity() ve length() farki?
	StringBuilder stb5 = new StringBuilder(11);
	stb5.append("Javammmmmmmmmmmmmmmm");
	/*
	 1)Belirlenen kapasiteyi gecerseniz kapasite 
	 belirlenen kapasitenin 2 katinin 2 fazlasi olarak yazilir.
	 Belirlenen kapasitenin 2 katinin 2 fazlasinida gecerseniz kapasite ile
	 length ayni olur.
	*/
	System.out.println(stb5.capacity());//24
	System.out.println(stb5.length());//20
	//Onemli Not
	StringBuilder stb6 = new StringBuilder("Java Kolay");
	stb6.append("X");
	System.out.println(stb6);//Java KolayX
	
	stb6.substring(8);
	System.out.println(stb6);//Java KolayX
	
	//substring() String class'inin methodudur. 
	//Bu yuzden StringBuilder'I update edemez.
	System.out.println(stb6.indexOf("v", 6));
	}

}
