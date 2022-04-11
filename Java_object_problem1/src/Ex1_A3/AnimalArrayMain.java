package Ex1_A3;

public class AnimalArrayMain {
	public static void main(String[] args) {
		Animal[] std = new Animal[5];

		std[0] = new Animal("猫", 45);
		std[1] = new Animal("ラクダ", 200);
		std[2] = new Animal("象", 330);
		std[3] = new Animal("ネズミ", 20);
		std[4] = new Animal("うさぎ", 37);

		for(int i = 0; i < std.length; i++) {
			std[i].info();
		}
	}
}



class Animal {
	String animal;
	int length;

	Animal(String animal, int length){
		this.animal = animal;
		this.length = length;
	}

	void info() {
		System.out.println("この" + animal + "は、体調" + length + "cmです。");
	}
}