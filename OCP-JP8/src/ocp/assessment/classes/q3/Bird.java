package ocp.assessment.classes.q3;

import java.io.*;

// public class Tail {}
public class Bird implements Serializable {													// Line 3
	
	private String name;
	private transient int age;																// Line 5
	/* 
	 * Exception in runtime: Tail does not implement Serializable
	 */
	private Tail tail;										

	public String getName() { return name; }
	public Tail getTail() { return tail; }
	public void setName(String name) { this.name = name; }
	public void setTail(Tail tail) { this.tail = tail; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }

	public void main(String[] args) {
		/*
		 * Lines 16 and 17: IOExceptions are checked, and should be caught
		 */
		try(InputStream is = new ObjectInputStream(											// Line 16
				new BufferedInputStream(new FileInputStream("birds.dat")))) {				// Line 17
			/*
			 * Method readObject() is available on ObjectInputStream, but not InputStream;
			 * Also, we should cast 'Object' to 'Bird' explicitly.
			 */
			Bird bird = is.readObject();													// Line 18
		}	
	}
	
}
