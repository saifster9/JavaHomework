
// ****************************************************************
//   BandBooster.java
//
//   Write the BandBooster class assuming a band booster object
//   is described by two pieces of instance data: name (a string)
//   and boxesSold (an integer)
// ****************************************************************
import java.util.Random;

public class BandBooster
{
	// declare instance data
	private String name;
	private short boxesSold;

	// constructor
	public BandBooster(String boosterName)
	{
		name = boosterName;
		boxesSold = 0;
	}

	public String getName()
	{
		return name;
	}

	public void updateSales(int nbrOfBoxes)
	{
		boxesSold += nbrOfBoxes;
	}

	public String toString()
	{
		String Message = ("" + name + ":   " + boxesSold + " box(es).\n");
		return Message;
	}

	public int boxes()
	{
		return boxesSold;
	}

}