package Ex3_C1;

public abstract class AbstractSize_ex3C1 {
	private String name;

	protected AbstractSize_ex3C1(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void  setName(String name) {
		this.name = name;
	}


	public abstract int selectSize();
}
