// ***************************************************************
// FILE: IntList.java
//
// Purpose: Defines a class that represents a list of integers
//
// ***************************************************************

public class IntList
{
	private IntNode front; //first node in list
	
	public int len; //initialize the size of the list as empty

	//-----------------------------------------
	// Constructor. Initially list is empty.
	//-----------------------------------------
	public IntList()
	{
		front = null;
	}

	//-----------------------------------------
	// Adds given integer to front of list.
	//-----------------------------------------
	public void addToFront(int val)
	{
		front = new IntNode(val,front);
		len++;
	}

	//-----------------------------------------
	// Adds given integer to end of list.
	//-----------------------------------------
	public void addToEnd(int val)
	{
		IntNode newnode = new IntNode(val,null);

		//if list is empty, this will be the only node in it
		if (front == null)
			front = newnode;
		else
		{
			//make temp point to last thing in list
			IntNode temp = front;
			while (temp.next != null)
				temp = temp.next;
			//link new node into list
			temp.next = newnode;
		}
		len++;
	}

	//-----------------------------------------
	// Removes the first node from the list.
	// If the list is empty, does nothing.
	//-----------------------------------------
	public void removeFirst()
	{
		if (front != null)
			front = front.next;
		len--;
	}
	
	  public void replace(int oldValue, int newValue)
	  {
	    if (front != null)
	    {
		    for (IntNode curr = front; curr != null; curr = curr.next)
		    {
		      if (curr.val == oldValue) 
		      {
		    	  curr.val = newValue;
		      }
		    }
	    }
	  }

	//------------------------------------------------
	// Prints the list elements from first to last.
	//------------------------------------------------
	public void print()
	{
		System.out.println("--------------------");
		System.out.print("List elements: ");

		IntNode temp = front;

		while (temp != null)
		{
			System.out.print(temp.val + " ");
			temp = temp.next;
		}

		System.out.println("\n-----------------------\n");
	}
	
	// Method to return the length of the list
	
	public void length()
	{
		System.out.println("The Length of the list is: " + len);
	}
	


	//*************************************************************
	// An inner class that represents a node in the integer list.
	// The public variables are accessed by the IntList class.
	//*************************************************************
	
	private class IntNode
	{
		public int val; //value stored in node
		public IntNode next; //link to next node in list

		//------------------------------------------------------------------
		// Constructor; sets up the node given a value and IntNode reference
		//------------------------------------------------------------------
		public IntNode(int val, IntNode next)
		{
			this.val = val;
			this.next = next;
		}
	}
}
