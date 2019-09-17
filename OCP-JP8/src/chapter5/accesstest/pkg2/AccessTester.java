package chapter5.accesstest.pkg2;

import chapter5.accesstest.pkg1.AccessTest;

public class AccessTester extends AccessTest {
	public static void main(String[] args) {
		
		AccessTest ref = new AccessTest();
		// Which properties are accessible using 'ref'?
		
		//(default) a 
		ref.a; 					// modifier is default and AccessTest is in different package.
		
		// private b
		ref.b;					// private can be referenced only inside the class.
		
		// protected c() 
		ref.c(); 				// protected - see explanation below.
		new AccessTester().explanationAboucC();
		
		// public d()
		ref.d();				// public - accessible from anywhere.
		
	} 
	
	/**  <pre>
	 *    Protected main rules are simple, if a class is 
	 *   in the same package or inherits the class, 
	 *   it's accessible.
	 *    But this example is tricky - there's a special 
	 *   condition. If:
	 *    <code>
	 *    * accessed from diff package 
	 *    AND 
	 *    * reference of the superclass  
	 *    </code>
	 *    It cannot be reached. Think that a parent 
	 *    reference is NOT an inherited child of itself, 
	 *    and therefore has no right to access it, 
	 *    unless it was in the same package.
	 *   </pre>
	 */
	public void explanationAboucC() {
		
		AccessTest parentRef = new AccessTest();
		/* Parent reference - c() is not visible.
		 */
		parentRef.c();
		
		AccessTester childRefAndInst = new AccessTester();
		/* Properly inheriting the AccessTest class gives
		 * you the right of accessing the protected members.
		 */
		childRefAndInst.c();
		
		/* Reminder: it's not legal to put an parent
		 * instance on a child reference! A child is its
		 * parent, but not vice-versa.
		 */
		// AccessTester childRef = new AccessTest();
		
	}
}
