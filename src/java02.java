

public class java02 {
	
public static void main(String[] args) {
		
		int[] arr1 = new int[] {6, 4, 1, 2, 8, 0, 7, 3, 5, 9};
		int[] arr2 = new int[arr1.length];
		
		for(int m = 0; m < arr1.length; m++) {
			arr2[m] =  arr1[9-m];
		}
		
		System.out.println("str1"+" str2");
		
		for(int i =0; i < arr1.length; i++) {
		System.out.println(" " + arr1[i] + "    " +arr2[i]);
		}
		
		//拡張for
	}


}
