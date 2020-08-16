package day29exception;

import java.io.FileInputStream;
import java.io.IOException;


public class E02 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
		 fis = new FileInputStream("src/day29exception/TextFil");

int k=0;
		
		while((k = fis.read())!=-1) {
			System.out.print((char) k);
		}
		
		fis.close();
	}catch(IOException e) {//istisnai endiselei gidermek icin genlde try catch kullanilir
		System.out.println("Ya path ,ya dosya silinmis, yada dosya okunmayacak halde");
	}finally {
		System.out.println("Finally block calisti");
	
			fis.close();
	
	}
		
	//2 yolla sorun cozuluyor.throw yada try catch.
	//throw teknik mesaj veriyor try catch de kendimiz hatayi yazabiliyoruz.
	//Acilan dosyayi finally le kapatmamiz gerekiyor.
	//once yukarida obj atariz sonra finally ile kapatiriz.

	}

}
