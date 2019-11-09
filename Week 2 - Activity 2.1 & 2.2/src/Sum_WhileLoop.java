import java.util.Scanner;

public class Sum_WhileLoop
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int data, total=0; //declare variables to hold the number input by the user and total to hold the sum

		boolean repeat = true;

		while(repeat)
		{
			System.out.println("Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();
			total += data;

			if (data == 0) // Condition to terminate the loop
			{
				repeat = false;
			}			
		}

		System.out.println("The sum is " + total);
	}
}
