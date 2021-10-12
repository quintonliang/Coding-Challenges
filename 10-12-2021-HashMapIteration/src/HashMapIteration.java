import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		
		for (int key : map.keySet()) {
			System.out.println(map.get(key));
		}

	}

}
