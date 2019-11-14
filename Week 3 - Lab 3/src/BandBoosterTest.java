import java.util.Scanner;

public class BandBoosterTest
{
	public static void main(String[] args)
	{

		
		Scanner scan = new Scanner(System.in);
		
		BandBooster [] boosters = new BandBooster [2];
		
		// get names and create objects
		System.out.println("Enter name for first band booster: ");
		String name = scan.nextLine();
		boosters[0]= new BandBooster(name);
		
		System.out.println("Enter name for second band booster: ");
		name = scan.nextLine();
		boosters[1] = new BandBooster(name);
		
		// Prompt for and read in the number of boxes sold by each booster for each of the three weeks. 
		// Your prompts should include the booster’s name as stored in the BandBooster object. For example,
		//   Enter the number of boxes sold by Joe this week:
		
		// For each member, after reading in the weekly sales, invoke the updateSales method to update the total sales by that member.

		
		
		for (int i=0; i<3; i++)
		{
			System.out.println("Week #" + (i+1) + "\n");
			
			System.out.print("Enter the number of boxes sold by " + boosters[0].getName() + " for this week: ");
			short additionalBoxes = scan.nextShort();
			boosters[0].updateSales(additionalBoxes);
			
			System.out.print("Enter the number of boxes sold by " + boosters[1].getName() + " for this week: ");
			additionalBoxes = scan.nextShort();
			boosters[1].updateSales(additionalBoxes);
			
			System.out.println();
		}

		// After reading the data, print the name and total sales for each member (you will implicitly use the toString method here).
		
		for (int i=0; i<boosters.length; i++)
		{
			System.out.print(boosters[i]);
		}

	}

}