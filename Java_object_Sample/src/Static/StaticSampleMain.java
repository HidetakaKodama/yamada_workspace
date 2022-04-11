package Static;

public class StaticSampleMain {
	public static void main(String[] args) {
		StaticSample.sField = 787;
		StaticSample.sMethod();
		StaticSample s = new StaticSample();
		s.iField = 128;
		s.iMethod();
	}
}


class StaticSample{
	int iField;
	static int sField;

	void iMethod() {
		System.out.println("iField = " + iField);
	}

	static void sMethod() {
		System.out.println("sField = " + sField);
	}
}