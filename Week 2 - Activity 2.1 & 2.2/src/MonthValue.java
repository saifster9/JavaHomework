import java.util.Scanner;

public class MonthValue
{
	public static void main(String[] args)
	{
		// Accepts user input of a numerical value representing a month via a prompt
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter an integer corresponding to a month: ");

		int monthNumber;
		monthNumber = scan.nextInt();

		switch(monthNumber) // Switch block with 12 defined outputs corresponding to the user input.
		{
		case 1:
			System.out.println("The month is January");
			break;
		case 2:
			System.out.println("The month is February");
			break;
		case 3:
			System.out.println("The month is March");
			break;
		case 4:
			System.out.println("The month is April");
			break;
		case 5:
			System.out.println("The month is May");
			break;
		case 6:
			System.out.println("The month is June");
			break;
		case 7:
			System.out.println("The month is July");
			break;
		case 8:
			System.out.println("The month is August");
			break;
		case 9:
			System.out.println("The month is September");
			break;
		case 10:
			System.out.println("The month is October");
			break;
		case 11:
			System.out.println("The month is November");
			break;
		case 12:
			System.out.println("The month is December");
			break;
			
		default: //Catches exceptions due to incorrect inputs
            System.out.println("Wrong Input");
            break;
		}
		
	}

}
