package chapter6;

import chapter6.mymadeupexceptions.*;

public class TroubleThrowables {

	public static void main(String[] args) {
		
		TroubleThrowables t = new TroubleThrowables();
		try{ 
			t.helloThrowables(0);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		try {
			// declares throwing checked exception, needs to be caught/declared
			t.noNeedToThrow();
		} catch (MayNeverBeThrownException e){
			e.printStackTrace();
		}
		
		t.errorMineCamp();
	}
	
	/* All the Errors and exceptions extend Throwable - and
	 * that's the prerequisite to an item to be DECLARED (throws)
	 * or THROWN (throw new). 
	 */
	public void helloThrowables(int opt)
										// 	declaration 
											throws OneCheckedException {

		/* Runtime exceptions - or unchecked - doesn't need to be declared 
		 * or handled. But you can...
		 */
		if (opt == 0)
			throw new AnUncheckedException();
		
		/* Other exceptions - which extend Exception but not RuntimeException
		 * - are required to be either handled or declared. 
		 */
		if (opt == 1) {
			// handling (mandatory)
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println(e);
			}
			// declaring on method (mandatory if not handled)
			throw new OneCheckedException("caller will handle me");
		}
		
		/* Error are thrown by JVM (although user can throw too - being
		 * a terrible practice) and can be declared or handled, BUT no
		 * one expects you to do it, as it's bad practice. 
		 */
		if (opt <= -1) {
			// handling (bad practice)
			try {
				throw new GoddamnError("PC on fire like a samsung");
			} catch (Error err) {
				System.err.println(err);
			}
			// throwing - also bad practice
			throw new Error("No one expects me to show up");
		}
	}
	
	/* Declaring that you throw something obviously doesn't mean
	 * you have to throw anything 
	 */
	public void noNeedToThrow() throws MayNeverBeThrownException {
		System.out.println("so far so good");
	}

	public void errorMineCamp (){
		System.out.println(ErrorDamned.i);
	}
	
}

class ErrorDamned {
	static int i;
	
	/* ArithmeticException is thrown, but initializer actually throws an 
	 * error, which is ExceptionInInitializerError.		*/
	static {
		i = 10 / 0;
	}
	
	/* If you throw something explicitly, the compiler will
	 * notice and will NOT COMPILE.
	 */
	static {
		//throw new NullPointerException();
	}
}