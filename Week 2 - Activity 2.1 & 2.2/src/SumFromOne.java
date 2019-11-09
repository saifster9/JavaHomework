import java.util.Scanner;

public class SumFromOne
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);		
		int input, total = 0;
		boolean repeat = true;
		do
		{
			System.out.println("Enter a integer greater or equal to 1: ");
			input = scan.nextInt();
			if (input < 1)
			{				
					System.out.println("Wrong input");
			}
			else
			{
				for (int i = 1; i < input+1; i++)
				{
					total += i;
				}
			}
			System.out.println("The sum of integers from 1 to " + input + " is " + total);
			repeat = false;
		}
		while(repeat);
	}
}
