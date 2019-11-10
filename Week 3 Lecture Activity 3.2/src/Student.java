/*
Define a class of Students with the following properties and actions: a string name, an integer age, 
a Boolean variable indicating whether or not the student is an IT major, and a character gender.
The default value for name is an empty string, for age is 0, for the Boolean variable is false, 
and for the gender is ‘\u0000’.
To compute the student’s age, the year of birth and the current year must be provided.
The student’s name and gender are set to the values provided.
To set the Boolean value, the student’s major must be provided. If it is “IT”, the Boolean variable is set to true; 
otherwise, it is set to false.
A student can change major. In such situation, the new major must be provided. 
If it is “IT”, the Boolean variable is set to true; otherwise, it is set to false. 
 */

/*
 * Creating a class of Students with default values assigned to each property 
 */

class Student
{
	// attributes
	private String name;
	private int age;
	private boolean majorIT;
	private char gender;
	
	
	//  constructors
	public Student()
	{		
		name = "unknown";	//""'
		age = 0;
		majorIT = false;
		gender = 'u'; 	//\u0000';
	}
	
	public Student(String newName, int newAge, String major, char gender) 
	{
		this.setName(newName);
		this.setAge(newAge);
		this.setMajorIT(major);
		this.setGender(gender);
		
	}

	// behaviors
	public int calcAge(int birthYear, int currentYear)
	{
		return currentYear - birthYear;
		
		//int age = currentYear - birthYear;
		//return age;
	}
	
	public void changeMajor(String newMajor)
	{
		if (newMajor.equalsIgnoreCase("IT"))
			majorIT = true;
		else
			majorIT = false;
		
	}
	
	// getters and setters
	public String getName()
	{
		return name;
	}
	
	public void setName(String stuName)
	{
		name = stuName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public boolean getMajorIT()
	{
		return majorIT;
	}
	
	public void  setMajorIT(String major)
	{
		if (major.equalsIgnoreCase("IT"))
		{
			majorIT = true;
		}
		else
		{
			majorIT = false;
		}
	}

	public char getGender()
	{
		return gender;
	}

	public void setGender(char gender)
	{
		this.gender = gender;
	}

}
