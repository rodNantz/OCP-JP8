package chapter3;

// java.time classes
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAndTime {

	public static void main(String[] args) {
		
		/*  You cannot instantiate these classes directly, but
		 * always using static methods.
		 */
		LocalDate date = LocalDate.of(1995, Month.SEPTEMBER, 21);
		LocalTime time = LocalTime.of(3, 31, 59, 99);
		System.out.println(time);
		time = LocalTime.of(3, 30);
		LocalDateTime dateTime;
		
		/* Also, you do not change them directly, only getting the return
		 */
		date.plusYears(22);
		System.out.println(date);
		date = date.plusYears(22);
		System.out.println(date);
		/* You can use chaining
		 */
		date = date.minusYears(22).minusDays(18);
		System.out.println(date);
		
		/* LocalDateTime represents date AND time.
		 */
		dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime);
		
		
		/* Period class allows us to have time intervals.
		 */
		Period semestre = Period.ofMonths(6);
		Period quinzena = Period.ofDays(15);
		System.out.println(Period.of( 0, semestre.getMonths(), quinzena.getDays() ));
		/* 
		 * Let's make a period of seven months AND seven days.
		 * BUT for Periods, only the second will be considered
		 *  - do NOT use chaining.
		 */
		Period seteMaisSete = Period.ofMonths(7).ofDays(7);
		System.out.println(seteMaisSete);
		// the right way to do Period
		seteMaisSete = Period.of(0, 7, 7);
		System.out.println(seteMaisSete);
		
		
		/* 
		 * We have a class to format it all nicely  
		 */
		DateTimeFormatter dateDTF = DateTimeFormatter.ofPattern("d MMMM, yyyy");
		DateTimeFormatter timeDTF = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(date.format(dateDTF));
		System.out.println(time.format(timeDTF));
		// on the exam may appear: FormatStyle.SHORT and FormatStyle.MEDIUM
		DateTimeFormatter shortDTF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumDTF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(dateTime.format(shortDTF));
		System.out.println(dateTime.format(mediumDTF));
	
		/* The opposite of format() is parse(): it converts from string to a date.
		 */
		dateDTF = DateTimeFormatter.ofPattern("d MMMM, yyyy");
		date = LocalDate.parse("21 Setembro, 1995", dateDTF);
		time = LocalTime.parse("09:51");
		System.out.println(date);
		System.out.println(time);
	}

}
