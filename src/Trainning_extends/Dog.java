package Trainning_extends;

public class Dog extends Animal {
	
	//コンストラクタ
	public Dog(String Voice) {
		super(Voice);
	}
		
	@Override
	public void Sound() {
		System.out.print(voice);
		System.out.println(voice);
	}
}
