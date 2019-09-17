package chapter5;

public class OverridingVsHiding { 
	public static void main(String[] args) {
		ShadowVoldemort strendTingue = new ShadowVoldemort();
		strendTingue.move();				// prints 'Wooof'
		strendTingue = new Demogorgon();	
		strendTingue.move();				// prints 'Wraah' (overriden method)
		// Child reference cannot point to parent object (without explicit casting)
		// Demogorgon dg = new ShadowVoldemort();
	}
}




/*
 * INSTANCE
 */

class ShadowVoldemort {
	protected void move(){
		System.out.println("Wooooooooooofff");
	}
}

class Demogorgon extends ShadowVoldemort {
	/* Good usage of overriding methods
	 */
	protected void move(){
		System.out.println("Wraaaaaah");
	}
}

class Will extends ShadowVoldemort {
	/* A static method cannot HIDE an instance method (doesn't compile)
	 */
	/*
	protected static void move(){
		System.out.println("Can't move, It hurts everywhere");
	} */
}

/*
 * STATIC
 */

class Boulder {
	protected static void move(){
		System.out.println("Can't move, I'm static");
	}
}

class Rock extends Boulder {
	/* Good usage of hiding methods
	 */
	protected static void move(){
		System.out.println("I'm young and static");
	}
}

class RollingStone extends Boulder {
	/* An instance method cannot OVERRIDE a static method
	 */
	protected void move(){
		System.out.println("I can roll");
	}
}

