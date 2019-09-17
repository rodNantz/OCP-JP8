package chapter2;

import java.util.Random;

public class SwitchesAreHell {

	public static void main(String[] args) {
		SwitchesAreHell patti = new SwitchesAreHell();
		Random r = new Random();
		String lname = (r.nextInt(10) <= 3 ? "S" : "Smith");
		
		patti.peopleHaveThePower("Patti", lname);
	}
	
	/** <pre>
	 * Types allowed into a switch are:
	 * * byte, char, short, int (and its wrapper types);
	 * * String (since version 7)
	 *  </pre> 
	 */
	public int peopleHaveThePower(String firstName, final String lastName){
		String middleName = "Idunno";
		final String suffix = "Ms";
		int id = 0;
		
		switch(firstName) { 	// switched volatile value
			
			// O K U Y
			// Cases always must be final or literals! And also its type must match switch's.
			case "Test":
				id = 52;
				break;
				
			// 'suffix' is a final variable - OK
			case suffix:
				id = 0; 
				break;
			
			// W R O N G
			// middleName isn't a final variable - doesn't compile
			case middleName:
				id = 5;
				break;
				
			/* Although 'lastName' is final, its value can be different
			 * depending on what's passed on the method call. Not constant, 
			 * doesn't compile. 
			 * */
			case lastName:
				id = 8;
				break;
			
			// 5 is a literal but not a String as firstName variable
			case 5:
				id = 7;
				break;

			// It would be OK if switched value would an DayOfWeek Enum too.
			case java.time.DayOfWeek.SUNDAY:
				id = 15;
				break;
			
		}
		
		System.out.println(firstName + " " + middleName + " " + lastName + ", " + suffix);
		return id;
	}

}
