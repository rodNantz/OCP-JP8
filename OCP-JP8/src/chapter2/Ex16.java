package chapter2;

public class Ex16 {

	public static void main(String[] args) {
		
		// I hate it, HATE IT
		
		do {
			int y = 1;
			System.out.print(y++ + " ");
		} while(y <= 10); 				// <= THIS SHIT
		
		/* Y is not available on ths scope - and the while of "do/while"
		 * is out of the "do". That's stupid, but OK
		 */
		

	}

}
