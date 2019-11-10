
public class Circle
{
	private String name;
	private double radius;
	private String color;
	private final double PI = 3.14;
	
	// creating constructors with default values
	
	public Circle()
	{

	}
	public Circle(String name, double radius, String color)	
	{
		this.setName(name);
		this.setRadius(radius);
		this.setColor(color);		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
	
	public double getArea()
	{
		return radius * radius * PI;
	}
	
	public double getPerimeter()
	{
		return 2 * radius * PI;
	}
	
}
