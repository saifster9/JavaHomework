// ********************************************************************
// ParenMatch.java
//
// Determines whether or not a string of characters contains
// matching left and right parentheses.
// ********************************************************************

import java.util.*;
import java.util.Scanner;

public class ParenMatch
{
    public static final String LEFT = "([{";
    public static final String RIGHT = ")]}";
    
	public static void main (String[] args)
	{
		Stack<Character> s = new Stack<Character>();
		String line; // the string of characters to be checked
		Scanner scan = new Scanner(System.in);
		System.out.println ("\nParenthesis Matching");
		System.out.print ("Enter a parenthesized expression: ");
		line = scan.nextLine();
        
		// print the results
        if (check(line)) 
            System.out.println(line + " is good");
        else
            System.out.println(line + " is bad");
    }
	
	// loop to process the line one character at a time
    public static boolean check(String s) 
    {
        Stack st = new Stack();
        for (int i = 0; i < s.length(); i++) 
        {
            String c = "" + s.charAt(i);
            if (LEFT.contains(c))
                st.push(c);
            else if (RIGHT.contains(c)) 
            {
                String popped = (String)st.pop();
                if (!checkReverseChar(popped,c))
                    return false;
            }
        }
        return (st.size() == 0);
    }

    public static boolean checkReverseChar(String s1, String s2) 
    {
        if (s1.equals("(")) 
            return s2.equals(")");
        
        else if (s1.equals("[")) 
            return s2.equals("]");
        
        else if (s1.equals("{")) 
            return s2.equals("}");

        else 
            return false;
	}
}