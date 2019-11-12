import java.util.Arrays;

public class ArrayExample
{
	public static void main (String [ ] args)
	{
		String [ ] names = new String[10];
		Arrays.fill(names, "Jon Doe");
		System.out.println(Arrays.toString(names));
		names [0] = "Jack C";
		names [1] = "Dr. K";
		names [2] = "Anderson Carl";
		System.out.println(Arrays.toString(names));
		Arrays.parallelSort(names);
		System.out.println(Arrays.toString(names));
		/*for (int i = 0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
		*/
	}
}
