package chapter4;

import java.util.ArrayList;
import java.util.List;

public class StaticStuff {
	public static final String INIT_ME;
	public static final int ALREADY_INIT = 101;
	public static final String CANT_DOIT_TWICE = "OK";
	// 'The blank final field may not have been initialized'
	public static final List<String> WTF = new ArrayList<>();
	
	static {
		INIT_ME = "Final value";
		// 'the final field cannot be initialized'
		CANT_DOIT_TWICE = "Already initialized";
	}
	
	public static void main(String[] args) {
		/*
		 * Explanation:
		 * Concerning Reference final types, we can modify 
		 * it, BUT we can't change the object it points to.
		 */
		StaticStuff.WTF.add("Why this is possible");
		StaticStuff.WTF = new ArrayList<>();
	}

}
