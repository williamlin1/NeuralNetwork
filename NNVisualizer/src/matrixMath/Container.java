package matrixMath;

import java.util.HashMap;

public class Container {
	
	HashMap<String,Object> cache;
	
	public Container(HashMap<String,Object> cache) {
		this.cache = cache;
	}
	
	public HashMap<String,Object> getCache() {
		return cache;
	}
	
	public int size() {
		return cache.size();
	}
}
