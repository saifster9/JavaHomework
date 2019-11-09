import java.util.Scanner;

public class LeapYear
{

	public static void main(String[] args)
	{
		// Accepts user input of a year via a prompt
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter a year: ");

		int year = scan.nextInt();
				
		// Verifying the input and printing a message accordingly
		
		if (year % 4 == 0 && year % 100 != 0)
		{
			System.out.println(year + " is a leap year? true");
		}
		
		else if (year % 400 == 0)
		{
			System.out.println(year + " is a leap year? true");
		}
		else
		{
			System.out.println(year + " is a leap year? false");
		}

	}

}
