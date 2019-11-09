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

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */

class Student
{
	private String name;
	private int age;
	private boolean itMajor;
	private char gender;

	public Student()
	{
		name = "";
		age = 0;
		itMajor = false;
		gender = '\u0000';
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getAge()
	{
		return this.age;
	}

	public void setItMajor(boolean itMajor)
	{
		this.itMajor = itMajor;
	}

	public boolean getItMajor()
	{
		return this.itMajor;
	}

	public void setGender(char gender)
	{
		this.gender = gender;
	}

	public char getGender()
	{
		return this.gender;
	}

	public void changeMajor(String newMajor)
	{
		this.itMajor = newMajor.equals("IT");
	}

	@Override
	public String toString()
	{
		return name + " " + age + " " + itMajor + " " + gender;
	}
}

class Ideone
{

	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner obj = new Scanner(System.in);
		Student stu = new Student();
		System.out.println("Enter student's name");
		String name = obj.next();
		stu.setName(name);
		System.out.println("Enter student's year of birth");
		int birthYear = obj.nextInt();
		System.out.println("Enter the curernt year");
		int currentYear = obj.nextInt();
		int age = currentYear - birthYear;
		stu.setAge(age);
		System.out.println("Enter student's gender");
		char g = obj.next().charAt(0);
		stu.setGender(g);
		System.out.println("Enter the student's major");
		String major = obj.next();
		stu.setItMajor(major.equals("IT"));

		System.out.println(stu);
	}
}

