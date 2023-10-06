
public class EGjava13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
			
			
			System.out.println(Calculate.sum(5, 5));
			System.out.println(Calculate.minus(5, 5));
			System.out.println(Calculate.multi(5, 5));
			System.out.println(Calculate.divi(5, 5));
			
				
	}
			
		}
		
		// staticメソッドを違うクラスで呼び出すときは　クラス名.メソッド　で呼び出す
		// 
		class Calculate{
				
			// 足し算
			public static int sum(int n, int m) {
				return  n+=m;
				
			}
			
			static int minus(int n, int m) {
				 return n-=m;
			}
			
			static int multi(int n,int m) {
				return n*=m;
			}
			
			static int divi(int n, int m) {
				return n/=m;
			}
			
			
	}


