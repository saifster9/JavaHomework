
// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;
public class Sales
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of sales people: ");
		final int SALESPEOPLE = scan.nextInt();
		int[] sales = new int[SALESPEOPLE];
		int sum;
		double average;
		int maxPerson = 0;
		int maxSale = 0;
		int minPerson = 0;
		int minSale = 1000000;
		int value;



		for (int i = 0; i < sales.length; i++)
		{
			System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
			sales[i] = scan.nextInt();
			if (sales[i] > maxSale)
			{
				maxSale = sales[i];
				maxPerson = i + 1;
			}
			if (sales[i] < minSale)
			{
				minSale = sales[i];
				minPerson = i + 1;
			}
		}

		System.out.println("\nSalesperson Sales");
		System.out.println(" ------------------ ");

		sum = 0;

		for (int i = 0; i < sales.length; i++)
		{
			System.out.println(" " + (i + 1) + " " + sales[i]);
			sum += sales[i];
		}

		System.out.println("\nTotal sales: " + sum);
		average = sum / SALESPEOPLE;
		System.out.println("Average sales: " + average);
		System.out.println("\nSalesperson " + maxPerson + " had the highest sales with $" + maxSale + ".");
		System.out.println("Salesperson " + minPerson + " had the lowest sales with $" + minSale + ".");
		
		System.out.println("\nPlease enter a positive value: ");
		value = scan.nextInt();
		
		int x = 0;
		for (int i = 0; i < sales.length; i++)
		{
			if (sales[i] > value)
			{
				System.out.println("Salesperson " + (i + 1) + " sold $" + sales[i] + ".");
				x++;
			}
		}
		System.out.println("\nThe number of sales people who exceeded $" + value + " is " + x + ".");

	}
}
