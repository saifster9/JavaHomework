import java.util.Scanner;

public class HighestValue
{

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		// create array
		int[] numList = new int[10];

		// get the input for the list
		for (int i = 0; i < numList.length; i++)
		{
			System.out.print("Enter an integer: ");
			numList[i] = userInput.nextInt();
		}
		// close the scanner
		userInput.close();

		int max = 0;

		for (int i = 0; i < numList.length; i++)
		{
			if (numList[i] > max)
				max = numList[i];
		}

		System.out.println(max);
		
	}

}
