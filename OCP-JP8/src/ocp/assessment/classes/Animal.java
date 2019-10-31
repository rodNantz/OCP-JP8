package ocp.assessment.classes;

class Tail {}

public class Animal {
	public String name;
}

class Canine extends Animal {
	public Tail tail;
}

class Wolf extends Canine {}
	// Wolf has-a name.
	// Wolf has-a Tail.
	// Wolf is-a Animal.