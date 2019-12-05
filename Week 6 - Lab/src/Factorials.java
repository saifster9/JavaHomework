// ****************************************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
//
// If the integer is invalid (negative number) an IllegalArgumentException 
// will be thrown.
// ****************************************************************

import java.util.Scanner;

public class Factorials
{
	public static void main(String[] args)
	{
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);
		while (keepGoing.equals("y") || keepGoing.equals("Y"))
		{
			System.out.print("Enter an integer: ");
			int val = scan.nextInt();
			if (val < 0)
				{
					try
					{
						System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
						throw new IllegalArgumentException("Enter a positive integer");
					}
					catch (IllegalArgumentException ex)
					{
						System.err.println(ex);
					}
				}
			else if (val > 12)
			{
				try
				{
					System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
					throw new IllegalArgumentException("Enter an integer smaller than 12");
				}
				catch (IllegalArgumentException ex)
				{
					System.err.println(ex);
				}
			}
			else
			{
				System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
			}
			
			System.out.print("Another factorial? (y/n) ");
			keepGoing = scan.next();
		}
	}
}