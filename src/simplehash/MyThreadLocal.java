import java.util.HashMap;

public class MyThreadLocal<T> {
	private final HashMap<Long,T> map = new HashMap<Long,T>();

	public void set(T obj) {
		map.put(Thread.currentThread().getId(), obj);
	}

	public T get() {
		return map.get(Thread.currentThread().getId());
	}

}
