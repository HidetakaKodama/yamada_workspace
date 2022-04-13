package Ex2_B1;

public class TrainMain {
	public static void main(String[] args) {
		Train tra = new Train("中山道幹線", "211");
		tra.departure();
		tra.arrival();

		tra = new BulletTrain("成田新幹線","");
		tra.departure();
		tra.arrival();
	}
}
