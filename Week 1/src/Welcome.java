//    Assignment: Lab 1A
//      File Name: Welcome.java
//            Author: Cay Horstmann
//           Topic: Java Programming Environment
//     Description: Compiling and running a Java program from the command line
public class Welcome 
{ 
	public static void main(String[] args) 
	{ 
		String greeting = "Welcome to the Introduction to Java Technologies!"; 
		System.out.println(greeting); 
		for (int i = 0; i < greeting.length(); i++) 
			System.out.print("="); 
		System.out.println(); 
	} 
}
