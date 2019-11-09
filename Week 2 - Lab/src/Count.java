import java.util.Scanner;

public class Count
{
	public static void main(String[] args)
	{
		// a string of characters
		String phrase;

		// the number of blanks (spaces) in the phrase
		int countBlank;

		// the length of the phrase
		int length;

		// an individual character in the string
		char ch;
		Scanner scan = new Scanner(System.in);

		// Print a program header
		System.out.println();
		System.out.println("Character Counter");
		System.out.println();

		// Read in a string and find its length
		System.out.print("Enter a sentence or phrase: ");
		phrase = scan.nextLine();
		length = phrase.length();

		while (phrase.contentEquals("quit") == false)
		{
			// Initialize counts
			countBlank = 0;
			int countA = 0;
			int countE = 0;
			int countS = 0;
			int countT = 0;

			// a for loop to go through the string character by character and count the
			// blank spaces
			for (int i = 0; i < length; i++)
			{
				ch = phrase.charAt(i);
				switch (ch)
				{
				case 'a':
				case 'A':
					countA++;
					break;
				case 'e':
				case 'E':
					countE++;
					break;
				case 's':
				case 'S':
					countS++;
					break;
				case 't':
				case 'T':
					countT++;
					break;
				case ' ':
					countBlank++;
					break;
				}
			}

			// Print the results
			System.out.println();
			System.out.println("Number of A Letters: " + countA);
			System.out.println("Number of E Letters: " + countE);
			System.out.println("Number of S Letters: " + countS);
			System.out.println("Number of T Letters: " + countT);
			System.out.println("Number of blank spaces: " + countBlank);
			System.out.println();

			// Read in a string and find its length
			System.out.print("Enter a sentence or phrase: ");
			phrase = scan.nextLine();
			length = phrase.length();
		}
	}
}