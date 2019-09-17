package chapter2;

public class Labels {

	public static void main(String[] args) {

		// labels can be applied to loops, like FOR
		LARGS: for (String a: args) {
			// to IF statements
			LABIF: if (!a.equals("hide"))
				System.out.println(a);
		}
		
		// Labels can be applied to WHILE loop too
		int c = 0;
		ENQTO: while (c < 8){
			
			// It can be applied to any statement!
			PRINT1: System.out.println("Hi");
		
			// And also to code blocks {}
			PRINT2: {
		   		System.out.println(c);
		   		c++;
		   		if (c > 3) 
		   			break PRINT2; 
		   		else 
		   			System.out.println(c);
			}
		}
		   
		// Pay attention to scope when referring to labels
		c = 0;
		JACK: while (c < 8) {
			JILL: System.out.println(c);
			if (c > 3)
				// As 'JILL' has no curly braces, its scope is only the 'print' call
				break JILL;
				// On the contrary of 'JACK' scope
				//break JACK;
			else  
				c++;
		}
	}

	static void printMe(Object obj) {
		System.out.println(obj.toString());
	}
}
