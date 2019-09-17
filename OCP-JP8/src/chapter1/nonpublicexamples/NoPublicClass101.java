package chapter1.nonpublicexamples;

/*
 * In a .java file, you can have multiple package-access
 * classes, but only 0 or 1 public classes.
 * javac command to this file will create one .class file
 * for each one of the classes.
 */

class OneNoPublicClass {
	// trivia - main() can be final
	final public static void main(String args[]) { 
		System.out.println("this main() will not be called when running" + "\n\t"
						 + "java NoPublicClass101 " + "\n"
						 + "But actually when running " + "\n\t"
						 + "java OneNoPublicClass " + "\n"	);
	}
}

class OtherNoPublicClass { }

class NoPublicClass101 {
	public static void main(String args[]) { 
		System.out.println("java NoPublicClass101 " + "\n"
						 + "I'm not public, but I have the same name of the file! yay");
	}
}

/* If a public class is defined, it MUST have the same
 * name of the file.
 */
// public class NoPublicClass102{ }		// doesn't compile

