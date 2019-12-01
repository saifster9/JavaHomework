/*
 * Implementing an Exception Class to catch and handle a StringTooLongException
 */

public class StringTooLongException extends Exception
{
	public StringTooLongException(String msg)
	{
		super(msg);
	}
}