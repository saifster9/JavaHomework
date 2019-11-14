
public class Name
{
	// attributes
	private String first;
	private String middle;
	private String last;
	
	public Name (String first, String middle, String last)
	{
		this.first = first;
		this.middle = middle;
		this.last = last;
	}
	
	public String getFirst()
	{
		return first;
	}
	
	public String getMiddle()
	{
		return middle;
	}
	
	public String getLast()
	{
		return last;
	}
	
	public String firstMiddleLast()
	{
		return first + " " + middle + " " + last;
	}
	
	public String lastFirstMiddle()
	{
		return last + ", " + first + " " + middle;
	}
	
	public boolean equals(Name otherName)
	{
		if (this.first.equalsIgnoreCase(otherName.first) 
				&& this.middle.equalsIgnoreCase(otherName.middle) 
				&& this.last.equalsIgnoreCase(otherName.last))
			return true;
		else
			return false;
	}
	
	public String initials()
	{
		return first.toUpperCase().substring(0,1)
				+ middle.toUpperCase().substring(0,1)
				+ last.toUpperCase().substring(0,1);
	}
	
	public int length ()
	{
		return first.length()+middle.length()+last.length();
	}



}
