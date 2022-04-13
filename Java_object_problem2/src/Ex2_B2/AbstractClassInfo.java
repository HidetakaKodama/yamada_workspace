package Ex2_B2;

public abstract class AbstractClassInfo {
	public final void classInfo() {
		info();
		classes();
		classmate();
		club();
	}

	protected abstract void info();
	protected abstract void classes();
	protected abstract void classmate();
	protected abstract void club();
}
