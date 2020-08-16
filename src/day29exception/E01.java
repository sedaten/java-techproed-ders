package day29exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("src/day29exception/TextFile");
//file ulasmak icindir
//FileNotFoundException (Path yanlissa veya adosya silinmisse bu sorun cozer.
//IOException parents her tur girdi cikti sorunlarini cozer.
//Exception daha cok sorunlari cozer
		
	//**Burda kapatmaya mecbur gibisin.Kapatmazsan clauddan yuklu para gelir.
	}

}
