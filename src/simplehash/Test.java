import static java.lang.Math.random;

public class Test extends Thread {

	private static final ThreadId id = new ThreadId();

	public void run() {
		System.out.println(id.get());
	}

	public static void main(String... args) {
		Test[] tests = new Test[100];
		for(Test t : tests) {
			t = new Test();
			t.start();
		}
	}
}
