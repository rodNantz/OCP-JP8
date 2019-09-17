package chapter2;

public class IfElse{

	public static void main(String[] args){       
		// like we were running with args: {"closed"}
		String[] nuargs = {"closed"}; 
		
		if (nuargs[0].equals("open"))          
			if (nuargs[1].equals("someone"))
				System.out.println("Hello!");       
		else System.out.println("Go away "+ nuargs[1]);     
		
		/* Will print nothing - why?
		 * 
		 *   When using if-else statements without curly braces 
		 * {}, the 'else' statement will be associated to the most
		 * inner 'if', and not the first one. And here, the first
		 * 'if' condition will be false, and the other statements
		 * will not even run. 
		 */
		
		// correct indentation:
		if (nuargs[0].equals("open"))          
			if (nuargs[1].equals("someone"))
				System.out.println("Hello!");       
			else System.out.println("Go away "+ nuargs[1]);
	} 

}

