package Ex2_A1;

public class Warikan {
	private int menu1;//頼んだ料理１の値段
	private int menu2;//頼んだ料理２の値段
	private int menu3;//頼んだ料理３の値段
	private int ppl;//人数

	public int getAverage() {
		int dutch = (this.menu1 + this.menu2 + this.menu3) / this.ppl;
		return dutch;
	}

	public void setMenu1(int menu1) {
		this.menu1 = menu1;
	}

	public int getMenu1() {
		return this.menu1;
	}

	public void  setMenu2(int menu2) {
		this.menu2 = menu2;
	}

	public int getMenu2() {
		return this.menu2;
	}

	public void setMenu3(int menu3) {
		this.menu3 = menu3;
	}

	public int getMenu3() {
		return this.menu3;
	}

	public void setPpl(int ppl) {
		this.ppl = ppl;
	}

	public int setPpl() {
		return this.ppl;
	}

	public void introduce() {
		System.out.println(this.ppl + "人で割り勘した場合、一人当たりの金額は" + getAverage() + "円(小数点以下切り捨て)です");
	}
}
