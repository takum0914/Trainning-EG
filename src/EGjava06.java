

public class EGjava06 {

	
	//2-4 main関数を持つクラスを1つ、足し算、引き算、掛け算、割り算の計算をする関数を持つクラスをそれぞれ作 成してください。関数は動的メソッドとして作成してください。 また、関数は引数を持たず、クラスのインスタンス変数を使用し計算を行ってください。
	//main関数を持つクラスに、作成した足し算、引き算、掛け算、割り算の動的メソッドを使用し、計算を行って ください。

	
	public static void main(String[] args) {
		
				
		Calc sum = new Calc(5,5);
		sum.sum();
		
		Calc minus = new Calc(20,10);
		minus.minus();
		
		Calc multi = new Calc(2,10);
		multi.multi();
		
		Calc divi = new Calc(20,10);
		divi.divi();
		
		//Cal mainCal = new Cal();
		//Cal sum = new Cal(5,5);
		//System.out.println(.sum(5,5)); 	
		
	//手順１：calcクラスをインスタンス化する
		//手順２：インスタンスのメソッドを呼び出す
		//手順３：メソッドに引数を渡す
		//手順４：結果を出力する
	}
	
	//計算関数を持つクラス |  instance method
	 public static class Calc{
		 
		 //メンバ変数
		public int n;
		public int m;
		
		//コンストラクタが必要？インスタンス変数(メンバ変数）の初期化
		//コンストラクタを書く
		//コンストラクタに引数を持たせて、メンバ変数に格納
		//メンバ変数を使用し関数を引数無しで呼び出す
		public Calc(int N, int M){
			n = N;
			m = M;
		}
		 
		
		//  引数以外の形でｎ、ｍを使いたい
		//  引数以外のやり方があると考えてそのやり方を探す
		//public  int sum(int n, int m) {
				 //return n += m;
		//}
		
		
		 	public void sum(){
				System.out.println(n + m);
			}	
					
			public void minus() {
				System.out.println(n - m);
			}
					
			 public  void multi() {
				 System.out.println(n * m);
			}
			public void divi() {
				System.out.println(n / m);
		
		}
		
		
	}
	
	
	
	
	


}
