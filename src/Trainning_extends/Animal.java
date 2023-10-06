package Trainning_extends;

public class Animal {
	
	//メンバ変数
	String voice;
	
	//鳴き声を出力
	public Animal(String Voice) {
		voice = Voice;
	}
	
	public void Sound() {
		System.out.println(voice);
	}
}
