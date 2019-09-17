package chapter2;

public class Ex8 {
	public static void main (String[] a){
		
		boolean x = true, z = true;
		int y = 20;
		// Understanding XOR (^): returns true only if one is true and other is false
		// - which is the case, as (y != 10) is true and (z receives false) is false.
		x = (y != 10) ^ (z = false);
		System.out.println(x +", "+ y +", " + z);
		
	}
}
