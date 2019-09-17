package chapter5;

class ShadowMonster {
	protected void move(){
		System.out.println("Wooooooooooofff");
	}
	void parentOnly(){
		System.out.println("Chatty monster");
	}
}

class DemoDog extends ShadowMonster {
	public void move(){
		System.out.println("Wraaaaaah");
	}
	
	void childOnly(){
		System.out.println("Silent dog");
	}
}

public class OverrideTricks {

	public static void main(String[] args) {
		ShadowMonster shadow = new ShadowMonster();
		shadow.move();
		DemoDog dart = new DemoDog();
		dart.move();
		
		/* This will print the child method, 'cause the 
		 * object type is DemoDog
		 */
		ShadowMonster what = new DemoDog();
		what.move();
		
		/* And, what if, using parent class and child object,
		 * we use a method defined only in the child? 
		 */
		// what.childOnly();		// does not compile
		
		// However, it's allowed if defined only in the parent.
		what.parentOnly();
	}

}


