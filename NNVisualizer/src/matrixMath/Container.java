package matrixMath;

import java.util.HashMap;

public class Container {
	
	HashMap<String,Matrix> cache;
	int integer;
	
	public Container(int integer, HashMap<String,Matrix> cache) {
		this.integer = integer;
		this.cache = cache;
	}
	
	public int getInt() {
		return integer;
	}
	
	public HashMap<String,Matrix> getCache() {
		return cache;
	}
}
