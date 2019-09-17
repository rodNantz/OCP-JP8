package assessment;

import java.util.function.Predicate;

public class Ex17 {
	public static void main(String[] args) { 
		// INSERT CODE HERE 
		System.out.println( test(i -> i == 5) );
		System.out.println( test( (i) -> i == 5) );
		System.out.println( test((i) -> {return i == 5;}) );
		
		/* 
		 * wrong cases
		 */
		// System.out.println( test(i -> {i == 5;} ) );
		// System.out.println( test( (int i) -> i == 5) );
		// System.out.println( test((int i) -> {return i == 5;}) );
	} 
	private static boolean test(Predicate<Integer> p) { 
		return p.test(5); 
	}


}
