package chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StringUsage {

	public static void main(String[] args) {
		
		// String pool stores the same literal strings in the same address
		// therefore, they are the same object
		System.out.println("a "+ ("String" == "String"));
		
		// These are the same object too, as both references point to the same object
		String mew = "Mew";
		String mewtwo = mew;
		System.out.println("b " + (mew == mewtwo));

		// But THIS way, we explicitly create another object, which doesn't use String pool 
		// - So, not the same objects now
		mewtwo = new String("Mew");
		System.out.println("c " + (mew == mewtwo));
		
		// If the second object received "Mew", it would print true, but concat() returns another object
		mew = "Mew";
		mewtwo = "M".concat("ew");
		System.out.println("d " + (mew == mewtwo));
		
		// You can use equals() to check if the CONTENT is the same
		System.out.println("e " + (mew.equals(mewtwo)) );
		
		
		/* "BONUS": more hard cases (Enthuware etc)
		 */
	    String hello = "Hello", lo = "lo", abc = "abc";
	    
	    /* two String references with same literals poitn to the 
	     * same object on String pool 	 					  */
		System.out.print("1" + (chapter3.StringBuilderUse.abc == abc) + " ");    
		
		// The same goes with concatenating literals
		System.out.print("2" + (hello == ("Hel"+"lo")) + " ");
		
		/* HOWEVER, it's not valid when concatenating variables
		 * (unless it's a constant/final)					 */
		System.out.print("3" + (hello == ("Hel"+lo)) + " ");		 // false
		final String fLo = "lo";
		System.out.print("4" + (hello == ("Hel"+fLo)) + " ");
		
		/* But there's a method which forces JVM to lookup on the 
		 * String Pool - which is intern(). Then, it returns true
		 * even using a variable.							   */
		System.out.println("5" + (hello == ("Hel"+lo).intern()) );
		
		/* Tricks or treats (no treats but threats)
		 */
		String String = "string is a string";
		// Class names are not at all Java keywords! But, of course, terrible practice.
		MyCreatedClass MyCreatedClass = new MyCreatedClass();
		
		// But, we can then create some conflicts. e.g:
		// LocalDate LocalDate = LocalDate.now();
		/* Above, local variable takes precedence over class name, and
		 * we're not using the class name to call the static method. 
		 * This would not conflict using full path class:			*/
		LocalDateTime LocalDateTime = java.time.LocalDateTime.now();
		
		
		/* Nice tips to remember reserved keywords: 
		 */
		
		// No keyword has upper case letters!
		Object Null = new Object();
		
		// Primitives are all reserved keywords, but wrappers are not (as any other class);
		// Short short = new Short((short) 10);
		Long Long = new Long(42);
		
		// Also, modifiers and boolean literals and also null are all reserved.
		
	}

}

class MyCreatedClass{
	static final String HI = "Hi"; 
}
