import java.util.Scanner;

public class Sum_DoWhileLoop
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int data, total=0; //declare variables to hold the number read from user and total to hold the sum
		boolean repeat=true;

		//Implement a loop to read user input and append to the total; also check whether to terminate the loop and execute accordingly
	
		do
		{
			System.out.print("Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();
		
			if (data == 0)
			{
				repeat = false; //Condition to terminate the loop
			}
			else
			{
				total += data;
			}
		}
		
		while(repeat); //exit the loop when 0 is entered

		System.out.println("\nThe sum is " + total); //print the sum of the numbers entered

	}

}