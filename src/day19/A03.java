package day19;

import java.util.Arrays;

public class A03 {

	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		
		if(arr1==arr2) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}
	//(==)Not Same cikarir
		int arr3[] = {1,2,3};
		int arr4[] = {1,2,3};
		
		if(Arrays.equals(arr3, arr4)) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}//Same olur
	
	
	
	
	
	
	
	
	
	
	}

}
