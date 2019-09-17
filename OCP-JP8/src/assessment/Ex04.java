package assessment;

public class Ex04 {
	public static void main(String[] args) { 
		boolean keepGoing = true; 
		int count = 0; 
		int x = 3; 
		while(count++ < 3) { 
			System.out.println("\n Count: "+ count);
			System.out.println("1 + 2 * count == " + (1 + 2 * count));
			int y = (1 + 2 * count) % 3;
			System.out.println("x: " + x + " and y (mod 3): " + y);
			switch(y) { 
				default:
					System.out.println("default");
				case 0: 
					x -= 1; 
					break; 
				case 1: 
					x += 5; 
			}
			System.out.println("\tx: " + x);
		} 
		System.out.println("\nResult: "+ x); 
	}
 
}
