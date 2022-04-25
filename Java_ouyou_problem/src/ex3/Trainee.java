package ex3;

public class Trainee {
	public String name;
	public Trainee(String name) {
		this.name = name;
	}

	public void introduce() {
		System.out.println("研修生の名前は" + name + "です。");
	}
}
