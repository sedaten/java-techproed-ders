package day32interface;

public interface Car {
/*
 1)Interface bir klass degildir.interface interfacedir.
 2)Abstract classlarin icine concrate methodlar koyabilirdik.
 ama interfacelerin icine bazi ozeldurumlar haric concrate method koyamayiz.
 Yani interfaceler sadece abstract methodlar icerebilir. Bu yüzden interface 
 kullanimi "Full absraction" olarak adlandirilir. Abstract class kullanimina
 "partial" abstraction denir.
 3) interfaceler iclerindeki methodlari default olarak
  "abstract" kabul ederler. Bu yuzden method olusturulurken abstrackt keyword 
  istege baglidir. Asagidaki motor () methodunda yazmadik sorun yok. 
  direksiyonda yazdik yine sorun yok. 
 4) interface icine concrate methot koyatsaniz CTE verir
 5) interface'lerdeki methodlar default olarak public olurlar.
 protected, private,default olamazlar.
 6) interfacelerde variableler default olarak "final" olurlar.
 7)interfacelerde variableler access modifier'lari default olarak "public olurlar.
 8)interfacelerin variableleri default olarak "static" olurlar.
 9)interfacelerden obje uretilemez.
 10) interfacelerde variable olusturdugunuzda 
 mutlaka deger atamasi(initialize) yapmalisiniz.
 */
	int i = 12;
	final public static int k=13;

	
	public void motor();
 
	public abstract void direksiyon();
	
	//teker() hem publicdir hemde abstracttir.
	//void teker(); = public void teker() = abstract void teker(); == 
	//public abstract void teker();
	void teker();
	
	void fiyat();
}
