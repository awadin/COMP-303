import java.util.ArrayList;

//Author: Aidan Wadin
//Date: November 26, 2018
//Purpose: This is the abstract class in the template pattern. It holds most of the common code, except for the abstract protected methods
//In those methods each extending subclass must implement those themselves, as they are particular to different objects that share this parent class

public abstract class TableTM <T> 
{
	private ArrayList<T> list;
	//This is always be a string I assume
	private ArrayList<String> cols;
	
	//Constructor
	public TableTM( ArrayList<String> cols)
	{
		this.list = new ArrayList<T>();
		this.cols = cols;
	}
	
	public void addItem(T item)
	{
		list.add(item);
	}
	
	public void removeItem(T item)
	{
		list.remove(item);
	}
	
	//Same method as seen in "Table" class
	public int headerLength(ArrayList<String> input)
	{
		int size = 0;
		for(String s : input)
		{
			//This +1 is for a space following the string 
			size += 2;
			size += s.length();
		}
		return size;
	}
	
	//Same method as seen in "Table" class
	public void printHeader()
	{
		//Print out the header
		for(int i = 0; i < cols.size(); i++)
		{
			System.out.format("%2s %2s %2s", "", cols.get(i), "");
		}
		
		System.out.println( );
		//Print out the line under the header
		for(int i = 0; i < headerLength(this.cols) * 1.5; i++)
		{
			System.out.print("-");
		}
		System.out.println( );
	}
	
	//Same method as seen in "Table" class
	public void printRows()
	{
		for(T item : list)
		{
			printRow(item, cols.size());
			System.out.println( );
		}
	}

	//These 2 methods are not implemented in the parent abstract class, they are defined in the subclass that instantiates a specific instance of TabelTM
	protected abstract int calculate(int num1, int num2, int num3);
	protected abstract void printRow(T t, int headerLength);
	
	//Same method as seen in "Table" class
	public void print()
	{
		printHeader();
		printRows();
	}
}
