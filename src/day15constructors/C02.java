package day15constructors;

public class C02 {
/* 
 1)Class olusturdugunuzda java bizim kesinlikle obje uretecegimizi dusunur 
  ve class ile beraber gorunmez bir consttor olusturur. Bu Cnstt parametresiz
  Cnsttddir. Ismi default cntt dir
 2) Siz kendiniz herhangi bir Cnttr uretirseniz 
 Java default consttr iptal eder.
 */
	C02(int i){
		
	}
	C02(){
		
	}
	
	public static void main(String[] args) {
	
		C02 obj1 = new C02();
	}

}
