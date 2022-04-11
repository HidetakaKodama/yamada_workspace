package Ex1_A3;

public class Animal {
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
