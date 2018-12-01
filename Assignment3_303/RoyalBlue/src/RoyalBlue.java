import java.util.*;

//Programmer: Aidan Wadin     
//Program: RoyalBlue
//Created: Sept. 29, 2018
//Purpose: This is the main class for the project. It holds the main menu
public class RoyalBlue
{
	//This will hold the entire list of courses created, and will be expanded upon when new courses are added
	private ArrayList<Course> courses;
	
	//This will hold the entire list of students created and will be expanded when new courses are added
	private ArrayList<Student> students;
	
	//This is the constructor for a new school, a RoyalBlue school
	public RoyalBlue(ArrayList<Course> courses, ArrayList<Student> students){}
	
	//Main method to handle the user interaction
	public static void main(String args[]){}
	
	//This method asks for a students ID number and a classes ID number, then assigns that student to that class
	//There will be testers to make sure the class and student both already exist
	public void registerStudent(int studentID, int classID){}
	
	//This method asks for a student ID, class ID and grade with which to update for that student in that class
	//There will be testers to make sure the student and class exists and that the student it a part of that class
	public void addGrade(int studentID, int classID, int grade){}
	
	//This method asks for a a name and type to create a student, it will then use the proper constructor to create a new student of that type
	//It will generate a random ID number for the student itself, so no user error can occur with duplicate ID numbers
	//When a new student is created, depending on their type, they will be registered for a course within the currently available courses
	//This method will use some user interaction within the main loop by using the courses Arraylist to help the user select which classes their new student will occupy
	public Student createStudent(String name, String type, ArrayList<Course> courses){}
	
	//This method asks for a name and size to create a class
	//The method generates a random ID number for the class itself, and then adds that class to the course ArrayList
	public Course createCourse(String name, int classSize, ArrayList<Course> courses){}
	
	//Exit program
	public void exit(){}
}
