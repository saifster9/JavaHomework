import java.util.Scanner;

public class SSN
{	

	public static void main(String[] args)
	{
		// Create an instance of the scanner object to accept user input
		Scanner scan = new Scanner(System.in);

		// Prompt the user to input a Social Security Number
		System.out.print("Enter a SSN: ");
		String ssn = scan.nextLine();
		
		scan.close();
		
		// Checking validity of the input
		boolean isValid =
			(ssn.length() == 11) &&
			(Character.isDigit(ssn.charAt(0))) &&
			(Character.isDigit(ssn.charAt(1))) &&
			(Character.isDigit(ssn.charAt(2))) &&
			(ssn.charAt(3) == '-') &&
			(Character.isDigit(ssn.charAt(4))) &&
			(Character.isDigit(ssn.charAt(5))) &&
			(ssn.charAt(6) == '-') &&
			(Character.isDigit(ssn.charAt(7))) &&
			(Character.isDigit(ssn.charAt(8))) &&
			(Character.isDigit(ssn.charAt(9))) &&
			(Character.isDigit(ssn.charAt(10)));
		
		// Display result
		System.out.println(ssn + " is " + ((isValid)? "a valid " : "an invalid ")
				+ "social security number");
	}

}
