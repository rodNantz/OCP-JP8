package chapter2;

public class ForLoops {

	public static void main(String[] args) {
		/*
		 * Common FOR loop:
		 */
		boolean begin = false;
		int i;
		int j;
		for (i = 3, j = 0, begin = true; // initialize
										 j < i; // while condition
												++j, i--) // increment afterwards 
		{				
			/* The first statements will run before the loop 
			 * starts.
			 */
			if (begin) {
				System.out.println("begin");
				begin = false;
			}
			
			System.out.println(i + " " + j);
			/* Before the loop ends, the increments/decrements will not 
			 * be ran. The new values will be on the next iteration. */
		}
		System.out.println("out: "+ i + " " + j);
		
		//Syntax
		for (
				i = 3, j = 0, begin = true;						// Mind the initializers syntax! Declare new, multiple variables or use existing ones!				
				j < i && begin; 								// Single boolean expression
				++j, i--, System.out.println("Post-potato")		// increment block - which actually can hold any statements, separated by comma.
			) 
			System.out.println("Hi");
		
		
		/* enhanced for loop
		 */
		String[] strs = {"uno", "dos", "tré"};
		for (String s : strs) {
			System.out.print(s + "! ");
		}
		// String s can also be declared final!
		for (final String s : strs)
			System.out.print(" final "+ s +"!");
		// p.s.: when there's only one statement, braces aren't required
		
		
		/* EXTRA - Enhanced FOR: Using already initialized 
		 * variable on the declaration part is not allowed!
		 */
		String st = null;
		/*
		for (st : strs) {
			System.out.print(st + "not allowed ");
		}
		*/
	}

}
