
public class MultiplicationTable
{
	// Prints multiplication table.
	public static void main(String[] args)
	{
		final int MAX = 12;

		for (int row = 1; row <= MAX; row++)
		{
			for (int column = 1; column <= MAX; column++)
				System.out.print(row * column + "\t");
			System.out.println();
		}

	}
}
