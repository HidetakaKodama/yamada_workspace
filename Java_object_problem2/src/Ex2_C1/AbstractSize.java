package Ex2_C1;

public abstract class AbstractSize {
	private String name;

	protected AbstractSize(String name) {
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
