package chapter1;

public class DefaultValues {
	static boolean bul;
	static byte baite;
	static short xorte;
	static char xar;		// '\u0000'
	static int inte;
	static long lougue;
	static float frout;
	static double dobre;
	static String estringueniu = new String();	// Reference type being initialized, Default value depends on the class
	static String referemssia;					// Reference type not initialized, Default value is null
	
	public static void main(String[] args) {
		printe(bul,
				baite,
				xorte,
				xar,
				inte,
				lougue,
				frout,
				dobre,
				estringueniu,
				referemssia
				);
		
		/* 
		 * The uninitialized reference prints null on print() 
		 * method - So, what happens when passing null 
		 * directly to the method?
		 */
		//System.out.println(null);				// does not compile
		
		/* And concatenating null and primitives?
		 */
		//System.out.println(null + true);		// does not compile
		//System.out.println(null + 1);			// does not compile
		//System.out.println(null + null);		// does not compile
		
		/*
		 * Only concatenating with String or a reference 
		 * pointing to null are printable.
		 */
		referemssia = null;
		System.out.println(null + " Hi");
		System.out.println(referemssia);
		
		
		/* 
		 * Notice that the print() method does not print the 
		 * literal marks as F or L.
		 */
		frout = 6F + 3.3f;
		System.out.println(xar + frout); 	// xar value here is 0 (or '\u0000')
		// 9.3 will be printed, no F or f .
		System.out.println(10F);
		/* 10.0 will be printed - even if the literal has
		 * no decimal points, it will output .0 for the floating
		 * point types (float and double).
		 */ 
		lougue = 6l + 1L;
		System.out.println(lougue + inte);
		// 7 will be printed, no L or l
		
		
		int localVar, localVar2;
		/*
		 * Local variables don't have an default value!
		 * Declaring them without initializing it is OK, but
		 * use it without initializing is not, so line below 
		 * will give and compilation error 
		 */
		// System.err.println(localVar + "does not compile");
	}

	
	static void printe(Object... wuts){
		System.out.println("\n ~ ~ ~ ~ ~ ~ ");
		for(Object wut : wuts){
			String className; 
			try {
				className = wut.getClass().getName();
			} catch (NullPointerException e) {
				className = null;
			}
			System.out.print(className);
			System.out.println(": " + wut);
		}
		System.out.print(" ~ ~ ~ ~ ~ ~ \n");
	}

	void tryPrint(Object obj){
		try {
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
