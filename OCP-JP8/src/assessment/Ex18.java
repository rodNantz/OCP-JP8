package assessment;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class Ex18 {
	public static void main(String[] args) {
		// java.util.Calendar is zero-index based, so April here == 3 
		System.out.println(LocalDate.of(2015, Calendar.APRIL, 1)); 
		// the new java.time APT is one-index based  
		System.out.println(LocalDate.of(2015, Month.APRIL, 1)); 
		System.out.println(LocalDate.of(2015, 3, 1)); 
		System.out.println(LocalDate.of(2015, 4, 1)); 
		// options above don't compile
		// System.out.println(new LocalDate(2015, 3, 1)); 
		// System.out.println(new LocalDate(2015, 4, 1));
	}
}
