package chapter4.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class LambdasWithPredicates {
	
	public static void main(String[] args) {		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Kangaroo", true, false));
		animals.add(new Animal("Fish", false,true));	// swims
		animals.add(new Animal("Turtle", false, true));
		animals.add(new Animal("Rabbit", true, false));
		
		print(animals,
				// 'ani' is our animal being tested on a function (that is, if ani contains "a")
				ani -> ani.toString().contains("a")
				);
		
		/*
		 * Some Java libs also take a Lambda!
		 * In this case, it uses Comparator functional interface.
		 */
		System.out.println(animals);
		
		Collections.sort( 
						animals, 
						(Animal a, Animal b) -> a.species.compareTo(b.species) 
						);
		
		// using Streams to print - don't mind about that
		animals.stream().forEach(System.out::print);
		System.out.println();
		
		
		
		/* EXTRA: Lambda syntax 
		 */
		List aList = new ArrayList<>();
		List lList = new LinkedList<String>();
		
		// Most simple and dummy example of lambda, which always returns true
		boolean bu = checkList(aList, a -> true);
		
		// Returns true if the list is empty
		bu = checkList(lList, x -> x.isEmpty());
		System.out.println(bu);
		
		/* You can use RETURN and ; also - Optional for single
		 * statements, mandatory for multiple.
		 * Returns true if the list is NOT EMPTY
		 */
		bu = checkList(aList, x -> 
			{
				boolean notEmpty = !x.isEmpty();
				return notEmpty;
			});
		System.out.println(bu);
		
		/* Parenthesis on the parameter list:
		 *  - Mandatory only if specifying the type
		 */
		bu = checkList(lList, (o) -> o.size() == 0 );	// optional
		System.out.println(bu);
		bu = checkList(lList, (List o) -> o.size() != 0 );	// mandatory
		System.out.println(bu);
		// Also, the Predicate is typed as List, so other types are not allowed
		// bu = checkList(aList, (ArrayList o) -> o.size() != 0 );
		
		/* p.s. add() method returns true if the list was changed.
		 */
		bu = checkList(lList, z -> {return z.add("hi");} );
		System.out.println(bu);
	}
	
	/* You don't need to implement simple boolean functional interfaces,
	 * Java already gives you one!
	 */
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for(Animal a : animals){
			// checker is the lambda, and "a" is an animal tested on this function  
			if(checker.test(a)){
				System.out.print(a + " ");
			}
		}
		System.out.println();
	}
	
	private static boolean checkList(List list, Predicate<List> p) {       
		return p.test(list);    
	}
	
}
