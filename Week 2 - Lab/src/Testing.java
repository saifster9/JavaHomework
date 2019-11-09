import java.util.Scanner;

public class Testing
{
	public static void main(String[] args)
	{
/*		3.	Write a while loop that will print “I love computer science!!” 100 times. Is this loop count-controlled?
		int count = 0;
		boolean loop = true;
		while (loop)
		{
			System.out.println("I love computer science!!");
			count += 1;

			if (count > 100)
				loop = false;
*/
		
/* 4.	Add a counter to the third example loop above (the one that reads and sums integers input by the user).
 		After the loop, print the number of integers read as well as the sum. Just note your changes on the example code.
 	 	Is your loop now count-controlled?
 */

		// ************************************************************
		// Salary.java
		// Computes the raise and new salary for an employee
		// ************************************************************

		double currentSalary = 0; // current annual salary
		int rating = 0; // performance rating (0 to 3)
		double raise = 0; // dollar amount of the raise

		Scanner scan = new Scanner(System.in);

		// Get the current salary and performance rating
		System.out.print("Enter the current salary: ");
		currentSalary = scan.nextDouble();

		System.out.print("Enter the performance rating: ");
		rating = scan.nextInt();

		// Compute the raise -- Use if ... else ...
		if (rating == 1)
		{
			raise = 0.06;
			raise *= currentSalary;
			System.out.println("");
		}
		else if (rating == 2)
		{
			raise = 0.04;
			raise *= currentSalary;
			System.out.println("");
		} else if (rating == 3)
		{
			raise = 0.015;
			raise *= currentSalary;
			System.out.println("");
		} else
			System.out.println("Not a valid input\n");

		// Print the results
		System.out.println("Amount of your raise: $" + raise);
		System.out.println("Your new salary: $" + (currentSalary + raise));
	}
}
