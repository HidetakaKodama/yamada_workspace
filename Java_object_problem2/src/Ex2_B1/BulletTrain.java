package Ex2_B1;

public class BulletTrain extends Train{

	public BulletTrain(String route, String type) {
		super(route,type);
	}

	@Override
	public void departure() {
		System.out.println(this.route + "が始発駅から発車します。");
	}

	public void arrival() {
		System.out.println(this.route + "が終点駅へ到着します。");
	}
}
