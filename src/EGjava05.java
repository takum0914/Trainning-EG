import java.util.HashMap;

public class EGjava05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		HashMap<Integer,String> map = new HashMap <>();
		
		map.put(1,"りんご");
		map.put(2,"いちご");
		map.put(3,"みかん");
		map.put(4,"バナナ");
		map.put(5,"メロン");
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + " " + map.get(i));
		}
		
		
		
		
		
		

	}

}
