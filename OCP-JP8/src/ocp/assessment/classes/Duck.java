package ocp.assessment.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *  Possible modifications to implement immutable pattern
 */
public class Duck {
	private String name;
	private List<Duck> ducklings;

	public Duck(String name, List<Duck> ducklings) {
		this.name = name;
		this.ducklings = new ArrayList<Duck>(ducklings);
	}
	
	public String getName() { return name; }
	
	public List<Duck> getDucklings() { return ducklings; }
	
	public String hasDucklings(Predicate<Duck> p) {
		return p.test(this) ? "Quack Quack": "";
	}
	
}


/* Mark the class as final
 */
final class ImmutableDuck {
	// mark attributes as final
	final private String name;
	final private List<ImmutableDuck> ducklings;
	
	public ImmutableDuck(String name, List<ImmutableDuck> ducklings) {
		this.name = name;
		this.ducklings = new ArrayList<ImmutableDuck>(ducklings);
	}
	
	public String getName() { return name; }
	
	/* Never use methods that give direct, or "by reference" 
	 * access to the fields. Instead, return a new object e.g.
	 */
	// public List<ImmutableDuck> getDucklings() { return ducklings; }
	public List<ImmutableDuck> getDucklings() { 
		return new ArrayList<ImmutableDuck>(ducklings); 
	}
	
	/* Catch: "any passed lambda expression would have access only to 
	 * the public methods of the class". So no change needed.
	 */
	public String hasDucklings(Predicate<ImmutableDuck> p) {
		return p.test(this) ? "Quack Quack": "";
	}
}