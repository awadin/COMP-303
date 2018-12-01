//Programmer: Aidan Wadin     
//Program: Pstudent
//Created: Sept. 29, 2018
//Purpose: This class holds the information for a singular PART TIME student

class Pstudent <S, C> extends Student
{
	//This is the constructor for a part-time student. It will use the usual Student parent constructor, but when this student is created, they are given a pre-defined set of classes
	//The number of classes they are put in will be validated within their instantiation to make sure they are within their proper parameters
	//For a part-time student to be valid, they must be in AT LEAST 1 course, so in its construction, they will be put into a course
	public Pstudent(S name, int ID, S type, C course1){}
	
	//This method checks to make sure the number of classes the student is in (input) is valid
	public boolean validClasses(int input){}
}
