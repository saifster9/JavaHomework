import java.util.Random;
import java.util.Scanner;

/**
 * Guessing Numbers
 * The problem is to guess what number a computer has in mind.
 * You’ll write a program that randomly generates an integer between 0 and 100, inclusive.
 * The program prompts the user to enter a number continuously until the number matches the randomly generated number.
 * For each user input, the program tells the user whether the input is too low or too high (or simply low or high), 
 * so the user can make the next guess intelligently
 * A number is too low or too high if it differs from the correct number by more than 20.
 */

public class HighLowGuessingGame
{
	public static void main(String[] args)
	{
		// Create a random number generator
		Random random = new Random();

		// Use Scanner for getting input from user
		Scanner scan = new Scanner(System.in);

		// Use the random generator to
		// pick a number between 0 and 99 (inclusive)
		int number = random.nextInt(101);
		int guess = -1;
		
		System.out.println("Guess a magic number between 0 and 100");

		// Loop until the user has guessed the number
		while (guess != number)
		{
			// Prompt the user for their next guess
			System.out.print("Enter your guess: ");

			// Read the users guess
			guess = scan.nextInt();

			// Check if the guess is high, low or correct
			if (guess < number)
			{
				// Guess is low; check how low
				if (number - guess > 20)
					System.out.println("Your guess is too low, please try again");
				else
					System.out.println("Your guess is low, please try again");
			}

			else if (guess > number)
			{
				// Guess is high, check how high
				if (guess - number > 20)
					System.out.println("Your guess is too high, please try again");
				else
					System.out.println("Your guess is high, please try again");
			} 
			else				
			{
				// Guess is correct !!
				System.out.println("Correct, the number was " + number);
			}
		}
	}

}