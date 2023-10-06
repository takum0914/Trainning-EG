
public class EGjava04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] arr3 = new int[100];
		
		for(int n = 0; n < 100; n++) {
			arr3[n] = n +1;
			}
		
		for(int m = 0; m < 100; m++) {
			if(arr3[m] % 2 == 0) {
				System.out.println(arr3[m]);
			}
		}
		//System.out.println(arr3[])
		}
			
	}
		
		//別解
		/*
		 for(int n = 1; n <= 100; n++){
		 	if(n % 2 ==0)
		 		System.out.println(n)
		 }
		 */




