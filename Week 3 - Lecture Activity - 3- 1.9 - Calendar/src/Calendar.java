import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar
{

	public static void main(String[] args)
	{
		/*
		 * Use the LocalDate class to write a program that displays a calendar for the current month as shown below
			The current day is marked with an asterisk (*). 
			Note that the program needs to know how to compute the length of a month and weekday for a given day. Please make use of Javadoc.
		 */
		
		// current day
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int dayOfMonth = date.getDayOfMonth();
		int year = date.getYear();
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		//System.out.println( dayOfWeek );
		int totalDaysInMonth = date.lengthOfMonth();
		
		//beginning of month
		LocalDate beginDay = LocalDate.of(year, month, 1);
		DayOfWeek beginDayOfWeek = beginDay.getDayOfWeek();
		
		// show the heading row
		System.out.printf("%7s%7s%7s%7s%7s%7s%7s%n", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
		
		// get the day value
		int day = beginDayOfWeek.getValue();
		
		// for loop
		for( int i = 1; i < day; i++ )
			System.out.printf("%7s", "");
		
		// show the numbers for the month (use asterisk if current day)
		for( int i = 1; i <=totalDaysInMonth; i++)
		{
			if ( i == dayOfMonth )
				System.out.printf("%7s", i + "*");
			else
				System.out.printf("%7s", i);
		
		// drop down to the next line if end of week
		if ( day == 7) //it is a Sunday
		{
			System.out.printf("%n");
			day = 0;
		}
		
			day++;
		}

	}

}
