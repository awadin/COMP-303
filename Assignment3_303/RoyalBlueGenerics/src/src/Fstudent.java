//Programmer: Aidan Wadin     
//Program: Fstudent
//Created: Sept. 29, 2018
//Purpose: This class holds the information for a singular FULL TIME student

public class Fstudent <C, S> extends Student
{
	
	//This is the constructor for a full-time student. It will use the usual Student parent constructor, but when this student is created, they are given a pre-defined number of classes
	//The number of classes they are put in will be validated within their instantiation to make sure they are within their proper parameters
	//In order for the full time student to be created properly, they must be in AT LEAST 4 classes, so when a student is created, they must be put in at least 4 classes
	public Fstudent(S name, int ID, S type, C c1, C c2, C c3, Co c4){}
	
	
	//This method checks to make sure the number of classes the student is in (input) is valid
	public boolean validClasses(int input){}
}
