
public class EGjava02 {
	
	public static void main(String[] args) {
		
		int[] str1 = new int[10];
		int[] str2 = new int[10];
		
		for(int n = 0; n <= 9; n ++) {
			str1[n] = n;
		}
		
		for(int m = 0; m < str1.length; m++) {
			str2[m] = 9 - str1[m];
		}
		
		System.out.println("str1"+" str2");
		
		for(int i =0; i < str1.length; i++) {
		System.out.println(" " +str1[i] + "    " +str2[i]);
		}
		
		//拡張for
		
		
		
		
	}

}
