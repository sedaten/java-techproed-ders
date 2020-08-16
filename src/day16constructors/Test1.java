package day16constructors;

public class Test1 {

	static int i = 1;
	int k = 1;
	public static void main(String[] args) {
	
		for(  i =1; i<10; i++) {  //int i = 1 olsaydi asagidaki i 1 olurdu.
			i = i+2;
			System.out.print(i+" ");
		}
		System.out.println("====>"+ i);//10
		
		for(int k=1;k<10;k++) {
			k= k+2;
			System.out.print(k+" ");
			
		}
			//System.out.println("=====>"+ k);
		//yukaridaki kod hata verir cunku static degil ama main method 
		//static. static olmayanlar static method'lar icinde kullanilamazlar
	}

}
