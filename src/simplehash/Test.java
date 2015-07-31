import static java.lang.Math.random;

public class Test extends Thread {

	private static final MyThreadLocal<Integer> value = new MyThreadLocal<Integer>();

	public void run() {
		value.set( (int) (random()*100) );
		System.out.println(value.get());
	}

	public static void main(String... args) {
		Test[] tests = new Test[100];
		for(Test t : tests) {
			t = new Test();
			t.start();
		}
	}
}
