import java.util.ArrayList;

//Programmer: Aidan Wadin     
//Program: Student
//Created: Sept. 29, 2018
//Purpose: This class is the template for the 2 types of students at this school.
/*
//THIS IS AN EXAMPLE FOR THE IMPLEMENTATION OF MEMBER
 * 
 */

public abstract class Student <S, C> implements Member<C>
{
	//Each student has a name, a unique ID number, a type (full or part time), and the number of classes they are in
	private S name;
	private int ID;
	private int NumClasses;
	private S type;
	//This holds the past classes of a given student
	private ArrayList<C> pastCourses;
	
	//This is the constructor of a student. Each student gets their own unique ID so that even duplicate names won't be a problem
	public Student(S name, int ID, S type){}
	
	public String getName(){}
	
	public String getID(){}
	
	public String getType(){}
	
	//This method checks to make sure the number of classes the student is in (input) is valid, it is overwritten by each child of Student to account for their individual needs
	public boolean validClasses(int input){}
	
	//List out all previously taken courses for this student
	public void membership(ArrayList<C> pastCourses){}
	
	//When a student is added to a course, their pastCourses ArrayList is updated accordingly
	public void takeEvent(int classID, ArrayList<C> pastCourses){}
	
	//Get the grade from a given course for this particular student
	public int getGrade(int courseID){}
}
