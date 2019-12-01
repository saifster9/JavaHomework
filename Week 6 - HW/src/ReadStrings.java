/*
 * Write a program that creates an exception class called StringTooLongException, designed to be thrown when a string is discovered that has 
 * too many characters in it. In the main driver of the program, read strings from the user until the user enters "DONE". If a string is entered 
 * that has too many characters (say 20), throw the exception. Allow the thrown exception to terminate the program.
 * 
 * Modify the solution to PP 11.1 such that it catches and handles the exception if it is thrown. Handle the exception by printing an appropriate 
 * message, and then continue processing more strings.
 */

import java.util.Scanner;

public class ReadStrings
{
	public static void main (String[] args)
	{
		final int MAX = 20;
		String input;
		Scanner scan = new Scanner(System.in);
		StringTooLongException lengthException = new StringTooLongException("Too many characters");
		
		do
		{
			System.out.println("Input a string, entering 'done' will terminate the program: ");
			input = scan.next();
			try
			{
				if (input.length() > MAX)
					throw lengthException;
			}
			catch (StringTooLongException e)
			{
				System.out.println(e.getMessage());
				
				//Terminating Program if the input is longer than 20 characters.
				
//				System.out.println("Terminating Program"); 
//				break;
				
				//Allowing the program to continue accepting input from the user after catching and handling the exception
				
				System.out.println("Please try again.");
			}
		}
		while (!input.equalsIgnoreCase("DONE"));
	}
}