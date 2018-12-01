import java.util.ArrayList; 
import java.util.HashMap;

//Programmer: Aidan Wadin     
//Program: Course
//Created: Sept. 29, 2018
//Purpose: This class holds the information for a Course object
public class Course 
{
	//Each course has its own name, unique ID number and a certain capacity of possible students
	private String name;
	private int ID;
	private int classSize;
	//This will hold the names of all the students in the class
	private ArrayList<String> classmates;
	//This will be the map that holds in it 2 things:
	//The first integer is the student's ID, where the second is the grade they received
	//Each course therefore has its own map of grades
	private HashMap<Integer, Integer> grades;
	
	//This constructor creates a UNIQUE course with its own ID and class size and own record of grades corresponding to each student in the course
	public Course(String name, int ID, int classSize, HashMap<Integer, Integer> grades){}
	
	//Print out who is in the class as well as how many spots are left
	public void classList(){}
	
	//Add a new student to the class
	public void addClassmate(int studentID){}
	
	//Return this students grade for this class
	public int getGrade(int studentId){}
	
	//Change the students grade and update their according file in this courses hashmap
	public void updateGrade(int studentID, int newGrade, HashMap<Integer, Integer> grades){}
}
