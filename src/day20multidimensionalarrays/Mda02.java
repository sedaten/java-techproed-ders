package day20multidimensionalarrays;

public class Mda02 {

	public static void main(String[] args) {
		// Soru:int Mda olusturun ve tum elemanlarinin 
		//toplamlarini ekrana yazdirin 

		int mdai[][]= { {1, 2},{3},{4, 5, 6} };
		//1nci yol Hard coding :(sevilmiyor)
	System.out.println(mdai[0][0]+mdai[0][1]+mdai[1][0]+mdai[2][0]+mdai[2][1]+mdai[2][2]);
		//21
	
	//2nci yol Dynamic coding :))sevilir
	
	int sum =0;
	
	for(int i=0;i<mdai.length; i++) {
		
		for(int k=0; k<mdai[i].length;k++) {
	
			sum = sum + mdai[i][k];
		
		}	
	}
	System.out.println(sum);//21
	
	
	
	}

}
