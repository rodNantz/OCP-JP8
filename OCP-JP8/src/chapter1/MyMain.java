package chapter1;

public class MyMain {
	public static String[] nullArray;
	
	public static void main(String[] argz) {
		/*
		 * main's String[] array passed from command line is 
		 * NEVER null. It is empty if no arguments are passed.  
		 */
		System.out.println(argz.length + "\n");
		System.err.println(nullArray.length);
	}

}
