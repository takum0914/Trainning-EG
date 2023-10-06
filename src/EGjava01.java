
public class EGjava01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "aaa";
		String str2 = "bbb";
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		
		String a = str1;
		
		str1 = str2;
		str2 = a;
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		
		
	}

}
