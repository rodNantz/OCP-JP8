package chapter2;

public class Ex18 {
	public static void main(String[] args) {
		int count = 0; 
		ROW_LOOP: for(int row = 1; row <=3; row++) 
			for(int col = 1; col <=2 ; col++) {
				System.out.println(row + " * " + col + " % 2 == " + (row * col % 2) );
				if(row * col % 2 == 0){
					System.out.println(row + "," + col + " count: " + count + " (continue)");
					continue ROW_LOOP;
				}
				count++; 
				System.out.println(row + "," + col + " count: " + count);
			} 
		System.out.println("\nFinal count: "+ count); 
	}
}
