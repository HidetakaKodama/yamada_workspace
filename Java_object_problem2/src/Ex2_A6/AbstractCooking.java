package Ex2_A6;

public abstract class AbstractCooking {
	public String foodstuff;

	public void ingredients() {
		System.out.println("食材は" + this.foodstuff + "です。");
	}

	public abstract void cook();//調理する。

}
