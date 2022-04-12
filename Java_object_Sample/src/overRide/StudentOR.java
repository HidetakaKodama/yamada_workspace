package overRide;

public class StudentOR{
	public static void main(String[] args) {

		Color2 c2 = new Color2();
		System.out.println(c2.getName1()); //赤 青
	}
}


class Color1 {
	String getName1() {
		return "赤";
	}
}


class Color2 extends Color1{
	@Override
	String getName1() {
		System.out.println(super.getName1());
		return "青";
	}
}
