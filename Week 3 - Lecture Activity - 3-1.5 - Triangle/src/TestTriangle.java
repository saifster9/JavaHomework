import java.util.Scanner;

public class TestTriangle
{
	public static void main(String [] args)
	{
		Triangle triangle = new Triangle();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the length of side a: ");		
		double a = scan.nextInt();
		triangle.setA(a);
		
		System.out.print("Enter the length of side b: ");
		double b = scan.nextInt();
		triangle.setB(b);
		
		System.out.print("The length of side c is: ");
		System.out.println(triangle.getC());
		
		System.out.print("The angle oppsite side a is: ");
		System.out.println(triangle.getD());		
		
	}
}