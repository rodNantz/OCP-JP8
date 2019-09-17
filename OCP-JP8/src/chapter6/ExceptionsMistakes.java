package chapter6;

public class ExceptionsMistakes {

	public static void main(String args[]) {
		/* Some of these methods declare throwing checked exceptions
		 * therefore you must either declare the throws on the main()
		 * or wrap it on a try/(catch|finally).
		 */
		
		rite();	
		
		try {
			alsoRite();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		rong();
		
		riteCuzRuntime();
	}

	public static void rite() {
		try {
			throw new Exception("hi");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
		
	public static void alsoRite() throws Exception {
		/*
		 * Here, the "throw e" will actually throw a NullPonterException,
		 * because the reference points to null. So 'e' will not be thrown,
		 * only this another NullPointer.
		 */
		Exception e = null;
		throw e;
	}
	
	public static void rong() {
		Exception e = null;
		//throw e;				// does not compile
	}
	
	public static void riteCuzRuntime() throws RuntimeException {
		throw new RuntimeException();
	}
	
}
