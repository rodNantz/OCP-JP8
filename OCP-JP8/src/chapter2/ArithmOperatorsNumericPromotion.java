package chapter2;

import static java.lang.System.*;

public class ArithmOperatorsNumericPromotion {

	public static void main(String[] args) {

		Object obj;
		double d;
		/*
		 * 1. If two values have different types, the less-wide 
		 * type will be cast to the widest type.
		 */
		
		short s = 1;
		long l = 10;
		obj = (s+l);
		out.println( valType(s) + " + " + valType(l) + " = " + valType(obj) );
		
		/*
		 * 2. If one of the values is integral and the other is floating-point,  
		 * the integral will be promoted to floating point 
		 */
		
		int i = 10;
		float f = 10.0f;
		obj = (i+f);
		out.println( valType(i) + " + " + valType(f) + " = " + valType(obj) );
		
		/*
		 * 3. Smaller data types - byte, short and char, are first promoted
		 * to INT when using a Java binary arithmetic operator. 
		 */

		byte b = 0b10;	// 2 on binary literal
		s = 0x1;		// 1 in hexadecimal
		char c = 'Z';	// 90
		obj = (b+s+c);
		out.println( valType(b) + " + " + valType(s) + " + " + valType(c) + " = " + valType(obj) );
		
		s = 10;
		short s2 = 3;
		obj = (s / s2);
		out.println( valType(s) + " / " + valType(s2) + " = " + valType(obj) );
		
		/* byte + short will result in a INT, because both are smaller types.
		   therefore, below will not compile 	*/
		
		// short shallNotCompile = b + s;
		int iCompile = b + s;
				
		/*
		 * 4. After all promotions, resulting type will be the same of
		 * the promoted operands
		 */
		
		/* Extra: implicit casting depends on the value 
		 * which the primitive can hold!
		 */
		out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE); 
		out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);
		
		out.println((int) Character.MIN_VALUE +"("+ Character.MIN_VALUE + "), "
				  + (int) Character.MAX_VALUE +"("+ Character.MAX_VALUE + ") ");
		// allowed
		char cMax = 65535;
		// not allowed - char range
		// cMax = 65536;
		// also not allowed, as char is signed
		// cMax = -1;
		out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
		out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);
		out.println(Float.MIN_VALUE + " " + Float.MAX_VALUE);
		out.println(Double.MIN_VALUE + " " + Double.MAX_VALUE);
		
		/*
		 * LITERALS
		 * (All equivalent to 33)
		 */
		b = 33;				// decimal
		s = 041;			// octal
		c = '!';			// char literal, using simple '' quotes
		i = 0x21;			// hexadecimal
		int ib = 0b100001;	// binary
		l = 33L;			// long literal  - using L or l
		f = 33F;			// float literal - using F or f
		d = 33;		
		
		printe(b, s, c, i, ib, l, f, d);
		
		
		/* EXTRA - Assignment = operator
		 */
		int rr, oo, dd;
		rr = oo = dd = 21; 		// they can be chained
		System.out.println(rr + " " + oo + " " + dd);
		
		// Also, they have the least precedence between operators.
		System.out.println(
				oo = 1 + 2 * dd - 1
				);
		
		
		/*
		 * But this will no compile!
		 */
		boolean b1, b2;
		b1 = b2 = false;
		//if (b2 != b1 = !b2)
			//System.out.println("won't get here");
		
		/* First we would solve the != operator
		 */
		System.out.println(b2 != b1);
		/* But then, we can't assign an value to a false!
		 */
		//false = !b2;
	
		
	}
	
	static String valType(Object obj){
		return obj.toString() + " (" + obj.getClass().getName() + ")"; 
	}
	
	static void printe(Object... wuts){
		for(Object wut : wuts){
			if (wut instanceof Character) {
				int charVal = ((Character) wut).charValue();
				System.out.print(wut.getClass().getName() + ": "+ charVal + "("+ wut + ") \t");
			}
			else
				System.out.print(wut.getClass().getName() + ": " + wut + "\t");
		}
		System.out.println();
	}
	
}
