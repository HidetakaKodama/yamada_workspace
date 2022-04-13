package Ex2_B1;

public class Train {
	public String route;
	public String type;

	public Train(String route, String type) {
		this.route = route;
		this.type = type;
	}

	public void departure() {
		System.out.println(this.route + "(" + this.type + "系)" + "が発車します。");
	}

	public void arrival() {
		System.out.println(this.route + "(" + this.type + "系)" + "が到着します。");
	}
}
