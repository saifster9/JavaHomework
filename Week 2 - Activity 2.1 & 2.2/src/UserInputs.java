import java.util.Scanner;

public class UserInputs
{

	public static void main(String[] args)
	{
		// Accepts user input of a number via a prompt
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter an integer: ");

		int n = scan.nextInt();
		
		// Verifying the input and printing a message accordingly
		
		if (n % 5 == 0)
		{
			System.out.println("HighFive");
		}
		
		else if (n % 2 == 0)
		{
			System.out.println("HighEven");
		}

	}

}
