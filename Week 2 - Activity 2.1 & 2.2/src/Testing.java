import java.util.Scanner;

public class Testing
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print ("Enter a positive integer: ");
		int number = scan.nextInt();
		while (number <= 0)
		{
			System.out.print ("That number was not positive.");
			System.out.print ("Enter a positive integer: ");
			number = scan.nextInt();
		}
		
	}

}