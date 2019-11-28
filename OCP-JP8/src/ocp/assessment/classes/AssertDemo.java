package ocp.assessment.classes;

public class AssertDemo {
	
	// compiles due to autoboxing
	public static void main(String [] args) {
		Integer x = 10;
		x++;
		/* the command line desn't throw assertion errors - so nothing happens. 
		   you must activate -ea to enable it. */ 
		assert x == null && x >= 0;
		System.out.println(x);
	}
	
}
