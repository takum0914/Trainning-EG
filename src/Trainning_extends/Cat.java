package Trainning_extends;

public class Cat extends Animal {
	//コンストラクタ
	public Cat(String Voice) {
		super(Voice);
	}
	
	@Override
	public void Sound() {
		System.out.println(voice+ " by 猫");
	}
}
