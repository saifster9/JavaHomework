import java.util.Scanner;

public class AdditionQuiz 
{
	public static void main(String[] args) 
	{
		// Accept two numbers as a user input and calculate their sum; and request user to enter a value for the sum
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = input.nextInt();
		System.out.println("Enter an integer");
		int b = input.nextInt();
		
		int sum = a + b;
		int answer;

		
		do // Implement a loop to check whether the users answer is correct, and repeat the loop if it isn't
		{
			System.out.print("What is " + a + " + " + b + "? ");
			answer = input.nextInt();

			if (sum==answer)
			{
				System.out.println("You got it!");
			}
			else
			{
				System.out.println("Wrong answer. Try again.");
			}
		}
		
		while (answer!=sum);
	}
}