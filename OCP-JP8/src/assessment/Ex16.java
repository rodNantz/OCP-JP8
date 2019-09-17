package assessment;

public class Ex16 {

	public interface Animal { public default String getName() { return null; } } 
	interface Mammal { public default String getName() { return null; } } 
	/* 
	 * Interface may not always have only abstract methods, but also have default
	 * implementations. 
	 * In the line above, compiler will suggests to override default methods 
	 * on Animal and Mammal, as both interfaces have the same signature.
	 */
	abstract class Otter implements Mammal, Animal {}
	
	
	/* 
	 * Making the classes Abstract (removing the 'Default', which is the opposite of abstract)
	 * and removing method implementation, also works for making it compile.
	 */
	public interface AnimalAbsM { public String getName(); } 
	interface MammalAbsM { public String getName(); }
	
	abstract class OtherOtter implements MammalAbsM, AnimalAbsM {}
}
