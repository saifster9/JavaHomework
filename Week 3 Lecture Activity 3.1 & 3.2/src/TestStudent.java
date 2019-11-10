
public class TestStudent
{

	public static void main(String[] args)
	{
		
		Student firstStudent = new Student();
		firstStudent.setName("Saif");
		firstStudent.setAge(29);
		firstStudent.setMajorIT("IT");
		firstStudent.setGender('M');
		
		System.out.println ( "State of First Student:\n" );
		System.out.println ( "\tName: " + firstStudent.getName() );
		System.out.println ( "\tAge: " + firstStudent.getAge() );
		System.out.println ( "\tIT Major? " + firstStudent.getMajorIT() );
		System.out.println ( "\tGender: " + firstStudent.getGender() );
		System.out.println ( "\tCalculated Age: " + firstStudent.calcAge(1990, 2019) );
	}

}