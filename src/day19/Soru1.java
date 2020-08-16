package day19;

public class Soru1 {

	public static void main(String[] args) {
		int x1[] = {0,1,2,3};
		int x2[] = {1,2,2,3};
		int i1 = 0;
		int i2 = 0;
		int count =0;
		while((i1<x1.length)&&(i2<x2.length))
		{
			if(x1[i1]==x2[i2]) {
				count++;
				i2++;
			}
			else if(x1[i1]<x2[i2]) {
				
			i1++;
			}else {
				i2++;
			}
	
	
		}
	
	System.out.println(count+","+i1+","+ i2);
	
	}

}
