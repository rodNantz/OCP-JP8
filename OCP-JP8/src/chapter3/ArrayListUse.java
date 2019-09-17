package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListUse {

	public static void main(String[] args) {
		
		// instantiating - old way
		ArrayList oldArrList = new ArrayList();
		oldArrList.add(false);
		oldArrList.add("old folks");
		System.out.println(oldArrList);
		
		// new, improved way - using generica
		List<Object> newArrList = new ArrayList<>();
		newArrList.addAll(oldArrList);
		// list.equals() works well when pe inferred implements equals()
		System.out.println("* Old and new equals?: "+ oldArrList.equals(newArrList));
		
		newArrList.add(Integer.parseInt("1"));
		newArrList.add(2);
		newArrList.add(7.7);
		System.out.println(newArrList);
		System.out.println("* Old and new equals?: "+ oldArrList.equals(newArrList));
		
		// remove() returns true when value to be removed is found
		System.out.println("* Removed false?: " + newArrList.remove(false) );
		System.out.println(newArrList);
		// remove() also allows removing by index - this will remove the first element
		System.out.println("* What removed: " + newArrList.remove(0) );
		System.out.println(newArrList);
		// set() returns the replaced old value
		System.out.println("* Replaced: "+ newArrList.set(newArrList.size()-1, "replaced") );
		System.out.println(newArrList);
		
		/* You can declare the estimate capacity for the array,
		 * but still the size will be the number of added items.
		 */
		List<String> sizedList = new ArrayList<>(10*1000);
		sizedList.add(null);
		System.out.println("* Size:"+ sizedList.size());
		
		sizedList.clear();
		System.out.println("* Cleared list is empty: "+ sizedList.isEmpty());
		
		System.out.println("* newArr contains 2?: "+ newArrList.contains(2) );
		System.out.println("* newArr contains Z?: "+ newArrList.contains("Z") );
		
		/* (List) Arrays.asList() accepts varargs, in other words, infinite parameters
		 */
		List<Integer> varargList = Arrays.asList(1, 2, 3, 4);
		
		// some list methods:
		System.out.println( varargList.contains("1") );					// takes any Object, returns boolean
		System.out.println( varargList.get(varargList.size() -1) );		// takes an int, returns Generic T object in that position.
		System.out.println( varargList.indexOf("4") );   				// takes any Object, returns int, -1 if not found
		
	}

}
