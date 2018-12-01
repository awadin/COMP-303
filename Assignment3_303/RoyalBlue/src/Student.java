import java.util.ArrayList;

//Programmer: Aidan Wadin     
//Program: Student
//Created: Sept. 29, 2018
//Purpose: This class is the template for the 2 types of students at this school.

public abstract class Student 
{
	//Each student has a name, a unique ID number, a type (full or part time), and the number of classes they are in
	private String name;
	private int ID;
	private int NumClasses;
	private String type;
	//This holds the past classes of a given student
	private ArrayList<Course> pastCourses;
	
	//This is the constructor of a student. Each student gets their own unique ID so that even duplicate names won't be a problem
	public Student(String name, int ID, String type){}
	
	public String getName(){}
	
	public String getID(){}
	
	public String getType(){}
	
	//This method checks to make sure the number of classes the student is in (input) is valid, it is overwritten by each child of Student to account for their individual needs
	public abstract boolean validClasses(int input);
	
	//List out all previously taken courses for this student
	public void history(ArrayList<Courses> pastCourses){}
	
	//When a student is added to a course, their pastCourses ArrayList is updated accordingly
	public void takeClass(int classID, ArrayList<Course> pastCourses){}
	
	//Get the grade from a given course for this particular student
	public int getGrade(int courseID){}
}
