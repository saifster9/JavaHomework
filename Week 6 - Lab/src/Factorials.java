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
		IllegalArgumentException e = new IllegalArgumentException();
		
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);
		while (keepGoing.equals("y") || keepGoing.equals("Y"))
		{
			System.out.print("Enter an integer: ");
			int val = scan.nextInt();
			try
			{
				if (val<0)
				{
					throw new IllegalArgumentException("Value entered cannot be a negative number");
				}
				else
					if (val >16)
				{
					throw new IllegalArgumentException("Value entered is too big, enter a number smaller than 16");
				}
				else
					System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));
			}
			catch (IllegalArgumentException ex)
			{
				System.out.println("Value entered cannot be a negative number");
			}
			System.out.print("Another factorial? (y/n) ");
			keepGoing = scan.next();
		}
	}
}