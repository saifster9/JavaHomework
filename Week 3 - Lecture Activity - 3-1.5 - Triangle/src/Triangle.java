/*
 * Write a program that takes a and b from the user and display the values of c and that of the angle:
 */
public class Triangle
{
	//parameters of the triangle	
	private double a; // side 1
	private double b; // side 2
	private double c; // side 3
	private double d; // angle between side 2 and 3
	
	//constructors
	public Triangle()	{	}

	public double getA()
	{
		return a;
	}

	public void setA(double a)
	{
		this.a = a;
	}

	public double getB()
	{
		return b;
	}

	public void setB(double b)
	{
		this.b = b;
	}

	public double getC()
	{
		this.c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return c;
	}

	public void setC(double c)
	{
		this.c = c;
	}

	public double getD()
	{
		this.d = Math.round(Math.toDegrees(Math.asin(a/c)));
		return d;
	}

	public void setD(double d)
	{
		this.d = d;
	}
	
	
}
