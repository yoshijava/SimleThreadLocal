import java.util.HashMap;

public class MyThreadLocal<T> {
	private final HashMap<Long,T> map = new HashMap<Long,T>();

	protected T initialValue() {
		return null;
	}

	public void set(T obj) {
		map.put(Thread.currentThread().getId(), obj);
	}

	public T get() {
		T ret = map.get(Thread.currentThread().getId());
		if(ret == null) {
			ret = initialValue();
			set(ret);
		}
		return ret;
	}

}
