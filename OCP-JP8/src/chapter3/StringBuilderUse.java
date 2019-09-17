package chapter3;

public class StringBuilderUse {
	public static String abc = "abc"; 
	
	public static void main(String[] args) {	
		/*
		 * Objects A and B are the same, as we make B receive object A. 
		 */
		StringBuilder a = new StringBuilder(abc);
		StringBuilder b = a.append("de");
		b.append("f").append("g");
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		/*
		 * To create a different object, you must use the new() constructor
		 */
		b = new StringBuilder().append(a).reverse();
		System.out.println("\na = " + a);
		System.out.println("b = " + b);
		
		//you can also create StringBuilder specifying expected size/capacity of object
		StringBuilder x = new StringBuilder(35);
		x.append("itaquaquecetuba de pinhamonhangaba");
		x.insert(15, "batata".toUpperCase());
		int i = x.indexOf("BATATA");
		
		System.out.println("\n" + i + " x = " + x);
		
		/* sb.substring() ATTENTION
		 * This StringBuildermethod returns a String, and 
		 * DOESN'T MODIFIY the original StringBuilder! 
		 */
		System.out.println("\nsubstring: " + x.substring(15, 21)); // indexes 15 to 20 (21 is exclusive)
		System.out.println(x);
		
		/*
		 * DIFF - String and StringBuilder
		 */
		String str = "Potato";
		b = new StringBuilder(str);
		// String has the concat() method
		str.concat(" head");						// str.append("wrong");
		// StringBuilder has the append() method
		b.append(" chips");
		
		// However, String is immutable
		System.err.println(str);
		System.err.println(b);		
		// So, you have to do something with the object returned
		str = str.concat(" fish");
		str = str + " and chips"; 	// works the same way as concat
		System.err.println(str);
		
		// starts/endsWith(str): only String 
		str.startsWith("no");
		// b.startsWith("method does not exist");
		
		// substring(int, int): both
		str.substring(5);
		b.substring(5);
		
		// charAt(int): both
		str.charAt(0);
		b.charAt(0);
		
		// to_____Case: String only
		str.toUpperCase();
		// b.toUpperCase();
		
		/*
		 * Usually, String has more useful methods than StringBuilder,
		 * which isn't a problem because you can use them when using
		 * stringBuilder.toString() method.
		 */
		
	}

}
