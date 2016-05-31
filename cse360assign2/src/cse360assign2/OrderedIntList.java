/**
 * @author Alexx Frankos
 * PIN# 25
 * Assignment 2 
 * CSE 360
 * OrderedIntList is a class with three methods, insertIntoList, doubleSizeOfArray and printAllValuesInList.
 * This class inserts Integers into an array by ascending order and if the array's size grows, then the size
 * of the array doubles, then their is the print method that prints all the values in the array.
 */
package cse360assign2;
public class OrderedIntList {
	
	protected int[] orderedIntList;  
	protected int NumOfElemInList = 0; 
	protected int lengthOfList;
	
	OrderedIntList ()
	{
		orderedIntList = new int[10];
		lengthOfList = orderedIntList.length;
		
	}
	/** insertIntoList
	 * Takes in an integer(newListInt), and inserts it in the orderedIntList
	 * from smallest to largest
	 * <p>
	 * @param newListInt is an integer that is to be inserted into orderedIntList
	 */
	public void insertIntoList (int newListInt) 
	{
		if(NumOfElemInList == lengthOfList) 
		{
			doubleSizeOfArray();
		}
		if(NumOfElemInList == 0)
		{
			orderedIntList[0]= newListInt;
			NumOfElemInList++;
		}
		
		else 
		{
			int holdInsertPosition = 0; 
			int listIndex = 0; 
			boolean foundInsertPosition = false; 
			
			while(foundInsertPosition != true && listIndex < NumOfElemInList)
			{
				if(newListInt < orderedIntList[listIndex])
				{
					foundInsertPosition = true;
				}
				else
				{
					listIndex++;
					holdInsertPosition++;
				}
			}
			
			for (listIndex = NumOfElemInList; listIndex > holdInsertPosition; listIndex--)
			{
			
				orderedIntList[listIndex] = orderedIntList[listIndex-1];
			}
		
			orderedIntList[holdInsertPosition]= newListInt; 
			NumOfElemInList++;
		}
	}
	
	/** doubleSizeOfArray
	 * makes a new array double the size of orderedIntList
	 * and copies orderedIntList into the new array
	 * then sets orderedIntList to equal the new array
	 */
	private void doubleSizeOfArray()
	{
		int []tempList = new int[NumOfElemInList*2];
		lengthOfList = lengthOfList*2;
		
		for (int listIndex = 0; listIndex < NumOfElemInList; listIndex++)
		{
			tempList[listIndex] = orderedIntList[listIndex];
		}
		orderedIntList = tempList;
	}
	
	/** printAllValuesInList
	 * goes through orderedIntList and prints all the values 
	 * with a space between them and every 5th element
	 * starts a new line to print 5 more elements in the orderedIntList
	 */
	public void printAllValuesInList() 
	{
		for (int listIndex = 0; listIndex < NumOfElemInList; listIndex++) 
		{
			if (listIndex % 5 == 0) 
			{
				System.out.println();
			}
			System.out.print(orderedIntList[listIndex] + "\t");	
		}
		System.out.println();;
	}
}