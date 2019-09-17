package chapter4;

public class Initializers extends SuperClass {
	// instance vars and initializers
	private String name = "Torchie";
	/* not static */ 
	{ 		
		// note that instance context can use static vars
		System.out.println(name + counter); 
	}
	// static vars and initalizers
	private static Integer counter = 42;
	static { 
		// BUT, not the opposite, static context using instance vars
		System.out.println(counter);
		//System.out.println(counter + name); 	// doesn't compile
	}
	
	public Initializers() {
		System.out.println("instantiated");
	}
	
	public static void main(String[] args) {
		System.out.println("print on main()");
		/* Instantiating
		 * On commenting the lone below, only static content applies.
		 */
		Initializers i = new Initializers();
	}

}

class SuperClass {
	private String dadName = "Old Pyre";
	private static Integer dadAge = 84;
	/* not static */ 
	{ 		
		System.out.println("^ " + dadName); 
	}
	// static vars and initalizers
	static { 
		System.out.println("^ " + dadAge); 
	}
	
	public SuperClass(){
		System.out.println("^ daddy instantiated");
	}
}