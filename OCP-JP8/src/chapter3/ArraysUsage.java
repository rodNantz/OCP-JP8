package chapter3;


public class ArraysUsage {
	public static void main(String[] args) {
		
		/*
		 * Multidimensional arrays are simply arrays inside arrays.
		 * This concept is well explained on: 
		 * http://faculty.ycp.edu/~dhovemey/spring2007/cs201/info/javaArrays.html
		 */
		
		
		/* Arrays cannot be initialized with 'new' and with both empty 
		 * sizes - you either declare at least one size or use an
		 * array initializer.
		 */
		// int[][] a = new int[ ][ ];			// won't compile	
		int[][] b = { {1, 2 , 3}, {4,5} };
		
		/* They can be declared partially, at least one size declared,
		 * from left to right.
		 */
		int[][] f = new int[3][ ];
		int[][][] k = new int[3][ ][ ];
		int[][][] l = new int[3][4][ ];
		
		/* But they cannot be declared with missing size when
		 * some size of the right side is filled!
		 */
		int[][] x = new int[3][4] ;
		// int[ ][ ] y = new int[ ][4] ;
		// int[][][] z = new int[3][ ][5] ;
		
		// different ways of declaring
		String[][] numbers = { {"1","2"}, {"3","4"} };	// 2D
		int[] numbers2[];							// 2D
		int[] notCool2[], notCool3[][];				// 2D and 3D 
		String[][] twoByThree = new String[2][3];
		
		// Three-dimensional array
		int stair = 5;
		String triDim[][][] = new String[stair--][stair--][stair = 3];
		System.out.println( triDim.length + ", " + triDim[0].length+", "+ triDim[0][0].length);
		
		triDim[0] = twoByThree;
		triDim[1] = numbers;
		triDim[2][2] = new String[] {"two","dim", "array", "yay"};
		printArray("triDim", triDim);
		
		// This is not the right syntax!
		// twoByThree[0,0] = "no good";
		
		twoByThree[0][0] = "not null";
		twoByThree[0][2] = "me too";
		// remeber the indexes are zero based - this is the last element
		twoByThree[1][2] = "da last";
		
		/* Think in multidimensional array as
		 * an array that contains arrays, and
		 * not as adresses, coordinates.
		 */ 
		printArray("twoByThree", twoByThree);

		/* Remember: these array declaration only work when 
		 * declaring it
		 */
		Integer[][] diffDeclare = { {1,2}, {3,4} };
		printArray("diffDeclare", diffDeclare);
		// numbers = { {1,2}, {3,4} };			// wrong
		
		// They don't need to be symmetric - Example 1
		Integer[][] notSymm = { {1,4}, {3}, {9,8,7} };
		printArray("notSymm", notSymm);
		
		/* giving a sibling to that alone 3 gives us ArrayIndexOutOfBounds,
		 * as you declared that second row to have size 1 
		 */
		// notSymm[1][1] = 2;		// RUNTIME ERROR
		
		// Example 2 asymmetric array
		String[][] notSymmStrs = new String[3][];
		notSymmStrs[0] = new String[4];
		notSymmStrs[1] = new String[3];
		notSymmStrs[2] = new String[5];
		// also, you can iterate the array using enhanced for (see method)
		printArrayEnhancedly("notSymmStrs", notSymmStrs);
		
	}
	
	/* ... */
	
	public static void printArray(String arrayName, Object[][][] triDarray){
		System.out.println("\n"+ "array " + arrayName + ":");	
		int i = 0;
		for (Object[][] twoDarray : triDarray) {
			System.out.println(arrayName + "["+ i + "]");
			printArray(null, twoDarray);
			i++;
		}
		System.out.println();
	}
	
	public static void printArray(String arrayName, Object[][] array){
		if(arrayName != null)
			System.out.println("array " + arrayName + ":");		
		// 1st array dimension - or iterating over R "rows"
		for (int r = 0; r < array.length; r++) {
			System.out.print("\t");
			// 2nd dimension, iterating over C "columns" or array inside each array[r]
			for (int c = 0; c < array[r].length; c++) {
				// printing the element found at
				System.out.print(array[r][c] + gimmeSpaceFor(array[r][c]));
			}
			System.out.println();
		}
		if(arrayName != null)
			System.out.println();
	}
	
	public static void printArrayEnhancedly(String arrayName, Object[][] twoDarray){
		System.out.println("array " + arrayName + ":");		
		// 1st array dimension - or iterating over R "rows"
		for (Object[] inner : twoDarray) {
			System.out.print("\t");
			// 2nd dimension, iterating over C "columns" or array inside each array[r]
			for (Object o : inner) {
				// printing the element found at
				System.out.print(o + gimmeSpaceFor(o));
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static String gimmeSpaceFor(Object item) {
		int printedSize = (item == null) ? 4 : item.toString().length();
		int spaces = 13 - printedSize; 
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < spaces; i++){
			sb.append(" ");
		}
		return sb.toString();
	}
	
}
