package Trainning_extends;

public class Lion extends Animal{
	
	//コンストラクタ
	public Lion(String Voice) {
		super(Voice);
	}
	
	@Override
	public void Sound() {
		System.out.println("ライオン： " + voice);
	}
}


