import java.util.Arrays;
import java.util.Scanner;

/*
 * Write a program that reads student scores, gets the best score, and then assigns grades based on the following scheme: 
	Grade is A if score is >= best - 10 
	Grade is B if score is >= best - 20; 
	Grade is C if score is >= best - 30; 
	Grade is D if score is >= best - 40; 
	Grade is F otherwise. 
The program prompts the user to enter the total number of students, then prompts the user to enter all of the scores, 
and concludes by displaying the grades. Below is a sample run:  
 */

public class AssignGrades
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		int bestScore = 0;
		int numOfStudents;
		System.out.print("Enter the number of students: "); // Determining the number of students, and the size of the scores array
		numOfStudents = scan.nextInt();
		int [ ] scores = new int[numOfStudents];
	 	
		System.out.print("Enter the students scores separated by a space ");
		int t=3,i;
	    while(t>0)
	    {
	    	for(i=0; i<4; i++)
	    		{
	    		scores[i]=scan.nextInt();
	    		System.out.println(Arrays.toString(scores));
	    		}
	    }
	}
}