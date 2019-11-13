
public class SimpleCircle
{
	// attribute
	double radius;
	final double PI = 3.14; // constant
	
	// constructors
	public SimpleCircle()
	{
		radius = 1;
		
	}
	
	public SimpleCircle(double newRadius)
	{
		radius = newRadius;
	}
	
	// behaviors
	public double getArea()
	{
		return PI * radius * radius;
	}
	
	public double getPerimeter()
	{
		return 2 * radius * PI;
	}
	
	// get and set methods
	public void setRadius( double newRadius)
	{
		radius = newRadius;
	}
	
	
}
