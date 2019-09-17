package asssessment.ex8;

public class Deer { 

	public Deer() {
		// 2) called by Reindeer constructor, this is the first thing being printed
		System.out.print("Deer"); 
	} 

	public Deer(int age) { 
		System.out.print("DeerAge"); 
	} 

	// 4) this private method will be callled instead of Reinder public one
	// Change to public/protected and it's overriden by Reindeer and 'true' is printed.
	// Changing also enables it to be called from outside this Deer class.
	private boolean hasHorns() { 
		return false; 
	} 

	public static void main(String[] args) { 
		Deer deer = new Reindeer(5); // call Reindeer constructor
		System.out.println(","
				/* 4) Man, this is tough... 
					The deer object is actually of Reindeer type, but Deer's hasHorns() is private,
					and accessible only inside this class - if this main() were inside Reindeer,
					the compiler would say: "the method hasHorns() of Deer is not visible".
					Anyway, Deer's HasHorns() will be called and 'false' will be printed. Reindeer's 
					hasHorns() doesn't override it here - mommy's method is private and cannot be 
					overriden. 
				*/
				+ deer.hasHorns()
				);	
		
		//Reindeer.remain(new String[]{""});
	} 

} 

class Reindeer extends Deer { 
	
	public Reindeer(int age) { 
		// 1) super() is being called here by default, therefore, Deer() with no arguments
		// 3) Then it returns and prints Reindeer
		System.out.print("Reindeer");
		
	} 

	public boolean hasHorns() { 
		return true;
	} 
	
	// this "main" isn't from the book
	public static void remain(String[] args) { 
		Deer deer = new Reindeer(500);
		// uncomment the line below to see it doesn't work (unless Deer's hasHorns() is Public)
		// - but then this method is overriden and hasHorns() returns TRUE.
		System.out.println("," + deer.hasHorns());	
	} 

}
