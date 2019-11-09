import java.util.Scanner;

public class AverageOfList
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of items: ");
		// int lenList = Integer.parseInt(input.nextLine() );
		int lenList = input.nextInt();
		
		//create array
		int[] numList = new int[lenList];
		
		//get the input for the list
		for (int i = 0; i < numList.length; i++)
		{
			System.out.print("Enter the numbers separated by a space: ");
			numList[i] = input.nextInt();
		}
		// close the scanner
		input.close();
		
		// calculate the average
		int total = 0;
		
		for(int i = 0; i < numList.length; i++)
		{
			total += numList[i];
		}
		
		float average = total/numList.length;
		
		//count the number of items above the average
		int count = 0;
		
		for (int i = 0; i < numList.length; i++)
		{
			if (numList[i] > average)
				count++; 	//incresae count by one
		}
		
		//display the analysis
		System.out.println("\n Average: " + average);
		System.out.println("Number of elements above the average is " + count);
	}
}