package chapter2;

import java.util.BitSet;

public class OtherOperators {
	
	static String timebomb = null;
	static boolean imFalse = false;
	
	public static void main(String[] args) {
		
		/* Bitwise / unconditional operators:
		 * Operate in a 'lazy' way, e.g. in a IF, if the first condition of an AND
		 * is false, the right side operand is still checked anyway 
		 */
		try {
			// exception will be thrown
			if(imFalse & timebomb.equals("boom"))
				System.out.println(" & ");
			System.out.println("Not safe! (will not get here)");
		} catch (NullPointerException npe) {
			System.err.print("operator & "); npe.printStackTrace();
		}
		
		/* short-circuit / conditional operators:
		 * 	|| , &&
		 * Operate in a 'smart' way, e.g. in a IF, if the first condition of an AND
		 * is false, the right side operand doesn't need to be checked.
		 */
		try {
			// It evaluates the first operand, and doesn't need to check the last
			if(imFalse && timebomb.equals("boom"))
				System.out.println(" && ");
			System.out.println("\nSafe!");
		} catch (NullPointerException npe) {
			System.err.println("operator && " + npe);
		}
		
		
		/* Other operators:
		 * XOR ^ : if only one of operands is true
		 */
		if(true ^ false)
			System.out.println("true ^ false == true");
		
		if(true ^ true)
			System.out.println("lie");
		else 
			System.out.println("true ^ true == false");
		
		/* Bitwise negation
		 * ~ : Valid for integral types, it negates the 32 bits on it
		 * It's like a ! but for inverting bits on an integral type.
		 */
		
		int five = 5;
		// 101
		System.out.println(five + ": " + Integer.toBinaryString(five));
		
		int notFive = ~ five;
		// a lot of bits then 010 (inverse bits of 101)
		System.out.println(notFive + ": " + Integer.toBinaryString(notFive));
		
		/* MOD
		 * This is an well-known operator, but let's see all its usage
		 */		
		int m = 15 % 10;
		System.out.println("m = 15 % 10	 	// m value is "+ m);
		m %= 3;
		System.out.println("m %= 3  		// m = 5 % 3 which is "+ m);

		// also with floating-point types
		float f = 5.5f % 3;
		System.out.println("5.5f % 3 == "+ f);
		
		
		/* EXTRA: Bitwise operators
		 * You can also use bitwise operators with integral types, which
		 * will result on an integral return 
		 */
		System.out.println("bw extra:");
		int op1 = 60;
		int op2 = 13;
		System.out.println(op1 +" == \n\t"+ intToBinaryStrAddZeroes(op1) );
		System.out.println(op2 +" == \n\t"+ intToBinaryStrAddZeroes(op2) );
		int bwAnd = op1 & op2;
		System.out.println(op1 +" & "+ op2 + " == \n\t"+ 
							bwAnd + " == \n\t" + intToBinaryStrAddZeroes(bwAnd) );

		
		
		/* OPERATOR TRICKS
		 * 1. Strings: Do you remember that when one of the operands is a String, 
		 * the + has operator has different meaning, right? 
		 */
		String str = "I'm ";
		boolean b = true;
		str += b;
		System.out.println(str);
		// And using = would NOT compile. 
		// str = b;	
		
		/* 2. char: is a tricky primitive, pay attention to it.
		 */
		char c = 'c';
		c += 1;
		System.out.println(c);
		c *= new Integer(2);
		System.out.println(c);	
		/* And again, = would not compile without explicit casting, because it's a char. 
		 * Review 'Numeric Promotion'. 	*/
		int i = 1;
		// c = i;
		
	}
	
	public static String intToBinaryStrAddZeroes(int op){
		String binaryStr = Integer.toBinaryString(op);
		int fillin0s = 16 - binaryStr.length();
		binaryStr = stringMultiply("0", fillin0s) + binaryStr;
		return binaryStr;
	}
	
	public static String stringMultiply(String s, int n){
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < n; i++){
	        sb.append(s);
	    }
	    return sb.toString();
	}
	
}
