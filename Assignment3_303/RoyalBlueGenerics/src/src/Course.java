import java.util.ArrayList; 
import java.util.HashMap;

//Programmer: Aidan Wadin     
//Program: Course
//Created: Sept. 29, 2018
//Purpose: This class holds the information for a Course object
//TIP: In relation to my RoyalBlue project for a more complete understanding of my generic naming:
//		S - Strings
//		T - Students/Members
//		I - Integers
// 		C - Courses/Events
public class Course <S, I, T>
{
	//Each course has its own name, unique ID number and a certain capacity of possible students
	private S name;
	private int ID;
	private int classSize;
	//This will hold the names of all the students in the class
	private ArrayList<T> classmates;
	//This will be the map that holds in it 2 things:
	//The first integer is the student's ID, where the second is the grade they received
	//Each course therefore has its own map of grades
	private HashMap<I, I> grades;
	
	//This constructor creates a UNIQUE course with its own ID and class size and own record of grades corresponding to each student in the course
	public Course(S name, int ID, int classSize, HashMap<I, I> grades){}
	
	//Print out who is in the class as well as how many spots are left
	public void classList(){}
	
	//Add a new student to the class
	public void addClassmate(int studentID){}
	
	//Return this students grade for this class
	public int getGrade(int studentId){}
	
	//Change the students grade and update their according file in this courses hashmap
	public void updateGrade(int studentID, int newGrade, HashMap<I, I> grades){}
}
