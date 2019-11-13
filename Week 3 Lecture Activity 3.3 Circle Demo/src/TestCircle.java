import java.util.Scanner;

public class TestCircle
{

	public static void main(String[] args)
	{
		
		// create a circle which is a green soccer ball of radius 27.5
		
		Circle circle1 = new Circle("Soccer Ball", 27.5, "Green");

		// returning the characteristics of the first circle
		//System.out.println("The first circle is a " + circle1.getColor() + " " + circle1.getName() + " with a radius of " + circle1.getRadius() + ".");
		

		
		Circle circle2 = new Circle();
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter the name of the second circle: ");
		String name = scan.nextLine();
		circle2.setName(name);
		System.out.println("Enter the color of the second circle: ");
		String color = scan.nextLine();
		circle2.setColor(color);
		System.out.println("Enter the radius of the second circle: ");
		double radius = scan.nextInt();
		scan.nextLine();
		circle2.setRadius(radius);
		
		scan.close();
		
		// returning the characteristics of the first and second circle
		System.out.println("The " + circle1.getName() + " has an area of "+ circle1.getArea() + " and a circumference of " + circle1.getPerimeter() + ".\n");
		//System.out.println("The second circle is a " + circle2.getColor() + " " + circle2.getName() + " with a radius of " + circle2.getRadius());
		System.out.println("The " + circle2.getName() + " has an area of "+ circle2.getArea() + " and a circumference of " + circle2.getPerimeter() + ".\n");
 
	}

}
