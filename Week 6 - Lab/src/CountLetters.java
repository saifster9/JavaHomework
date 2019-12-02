// ****************************************************************
// CountLetters.java
//
// Reads a words from the standard input and prints the number of
// occurrences of each letter in that word.
//
// ****************************************************************

/*
 * 1.	Run CountLetters and enter a phrase, that is, more than one word with spaces or other punctuation in between. 
 * It should throw an ArrayIndexOutOfBoundsException, because a non-letter will generate an index that is not between 0 and 25. 
 * It might be desirable to allow non-letter characters, but not count them. Of course, you could explicitly test the value of the character 
 * to see if it is between ‘A’ and ‘Z’. However, an alternative is to go ahead and use the translated character as an index, and catch an 
 * ArrayIndexOutOfBoundsException if it occurs. Since you want don’t want to do anything when a nonletter occurs, the handler will be empty. 
 * 
 * Modify this method to do this as follows:
	Put the body of the first for loop in a try.
	Add a catch that catches the exception, but don’t do anything with it.
Compile and run your program.

 */

import java.util.Scanner;

public class CountLetters
{
	public static void main(String[] args)
	{
		int[] counts = new int[26];
		Scanner scan = new Scanner(System.in);
		
		//get word from user
		System.out.print("Enter a single word (letters only, please): ");
		String word = scan.nextLine();

		//convert to all upper case
		word = word.toUpperCase();
		
		//count frequency of each letter in string
		for (int i=0; i < word.length(); i++)
		{
			//Check if the input contains characters which are not letters (A-Z) and catch it accordingly.
			try
			{
				counts[word.charAt(i)-'A']++;
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Not A Letter: " + "'" + word.charAt(i)+ "'");
			}
		}
		
		//print frequencies
		System.out.println();
		for (int i=0; i < counts.length; i++)
			if (counts [i] != 0)
				System.out.println((char)(i +'A') + ": " + counts[i]);
	}
}