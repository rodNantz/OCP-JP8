package chapter4.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaExprForDummies {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Fish", false,true));	// swims
		animals.add(new Animal("Kangaroo", true, false));
		animals.add(new Animal("Rabbit", true, false));
		animals.add(new Animal("Turtle", false, true));
		
		/* CheckIfHopper is a CheckTrait, for implementing it. 
		 * We will pass the tester this way
		 */
		print(animals, new CheckIfHopper());
		
		/* Thre problem is: we need to write a new class for every different 
		 * check: one for CheckIfSwimmer, and etc...
		 * So, we could use Lambdas instead:
		 */
		System.out.println("Lambda time");
		print(animals, a -> a.canSwim());
		/*
		 *  Notice that we don't need to use any class implementing CheckTrait.
		 * only an functional interface
		 */
			
	}
	
	/* This print class is good designed, as it can test for any class
	 *  that implements CheckTrait - being CheckIfHopper, CheckIfSwimmer
	 *  or anything similar. Good design.
	 */
	private static void print(List<Animal> animals, CheckTrait checker) {
		for(Animal a : animals){
			if(checker.test(a)){
				System.out.println(a + " ");
			}
		}
	}

}

// 

interface CheckTrait {
	boolean test(Animal ani);
}

class CheckIfHopper implements CheckTrait {
	public boolean test(Animal a){
		return a.canHop();
	}
}

class Animal {
	public String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal (String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	
	public boolean canHop() { return canHop; }
	public boolean canSwim() { return canSwim; }
	public String toString() { return species; }
}



