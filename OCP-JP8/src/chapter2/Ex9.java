package chapter2;

public class Ex9 {

	public static void main(String[] args) {

		int not4Ever = 0;
		for (int i=0; i<10; ){
			
			// int i is receiving zero and right side increments to 1
			i = i++;
			// but, in the next iteration, it still will be 0, and forever..
			
			System.out.println("Hello World " + not4Ever++);
			if (not4Ever >= 100) break;
		}
		
	}

}
