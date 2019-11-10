import java.util.Scanner;

public class TestStudent
{

	public static void main(String[] args)
	{
		// create Student object using default values
		Student firstStudent = new Student();

		// get info from user and set field values
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter student's name: ");
		String name = scan.nextLine();
		firstStudent.setName(name);
		System.out.print("Enter student's age: ");
		int age = scan.nextInt();
		scan.nextLine();
		firstStudent.setAge(age);
		System.out.print("Enter student's major: ");
		String major = scan.nextLine();
		firstStudent.setMajorIT(major);
		System.out.println("Enter student's gender: ");
		char gender = scan.nextLine().charAt(0);
		firstStudent.setGender(gender);

		// show the first student's state
		System.out.println("\nState of First Student:");
		/*System.out.println("\tName: " + firstStudent.getName());
		System.out.println("\tAge: " + firstStudent.getAge());
		System.out.println("\tIT Major? " + firstStudent.getMajorIT());
		System.out.println("\tGender: " + firstStudent.getGender());
		System.out.println("\tCalculated Age: " + firstStudent.calcAge(1990, 2019));
		*/
		firstStudent.displayInfo();
		System.out.println("Number of students: " + Student.numOfStudents);

		// create second Student object using the given values\]
		Student secondStudent = new Student("Jane Doe", 20, "CSE", 'F');		
		
		// show the second student's state		
		System.out.println("\nState of Second Student:");
		/*
		System.out.println("\tName: " + secondStudent.getName());
		System.out.println("\tAge: " + secondStudent.getAge());
		System.out.println("\tIT Major? " + secondStudent.getMajorIT());
		System.out.println("\tGender: " + secondStudent.getGender());
		System.out.println("\tCalculated Age: " + secondStudent.calcAge(1990, 2019));
		*/
		secondStudent.displayInfo();
		System.out.println("Number of students: " + Student.numOfStudents);
		
		// change second student major IT
		secondStudent.changeMajor("IT");
				
		// show the second student's state after change
		System.out.println("\nState of Second Student after major is changed:");
		/*System.out.println("\tName: " + secondStudent.getName());
		System.out.println("\tAge: " + secondStudent.getAge());
		System.out.println("\tIT Major? " + secondStudent.getMajorIT());
		System.out.println("\tGender: " + secondStudent.getGender());
		System.out.println("\tCalculated Age: " + secondStudent.calcAge(1990, 2019));
		*/
		secondStudent.displayInfo();
		System.out.println("Number of students: " + Student.numOfStudents);

		// creating a third student instance
		Student thirdStudent = new Student();
		
		System.out.print("\nEnter student's name: ");
		String name2 = scan.nextLine();
		thirdStudent.setName(name2);
		System.out.print("Enter student's age: ");
		int age2 = scan.nextInt();
		scan.nextLine();
		thirdStudent.setAge(age2);
		System.out.print("Enter student's major: ");
		String major2 = scan.nextLine();
		thirdStudent.setMajorIT(major2);
		System.out.println("Enter student's gender: ");
		char gender2 = scan.nextLine().charAt(0);
		thirdStudent.setGender(gender2);		
		
		//show the third student's state
		System.out.println("\nState of Third Student: ");		
		thirdStudent.displayInfo();
		System.out.println("Number of students: " + Student.numOfStudents);
	}

}