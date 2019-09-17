package chapter2;

public class Ex10 {

	public static void main(String[] args) {
		
		byte a = 40, b = 50;
		
		/* Sum of two bytes: both are implicitly cast to int. 
		 * Therefore we need to cast it to byte.
		 * But here (byte) cast is only casting variable 'a'. 
		 */
		byte sum = (byte) a + b;
		
		// This would be the correct way 
		sum = (byte) (a + b);
		
		System.out.println(sum);

	}

}
