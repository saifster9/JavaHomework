import java.util.Scanner;

public class CircleArea
{

	public static void main(String[] args)
	{
		// Accepts user input of a radius via a prompt
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter the radius: ");

		double radius = scan.nextDouble();
				
		// Verifying the input and printing a message accordingly
		
		if (radius >= 0)
		{
			double area = Math.PI*radius*radius;
			System.out.println("The area of the circle is: " + area);
		}
		
		else
		{
			System.out.println("Negative Input");
		}

	}

}
