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
	protected boolean debug = false;
	
	public OrderedIntList (boolean debugger)
	{
		orderedIntList = new int[10];
		lengthOfList = orderedIntList.length;
		debug = debugger;
	}
	/** insertIntoList
	 * Takes in an integer(newListInt), and inserts it in the orderedIntList
	 * from smallest to largest
	 * <p>
	 * @param newListInt is an integer that is to be inserted into orderedIntList
	 */
	public void insertIntoList (int newListInt) 
	{
		if(debug)
		{
			System.out.println("debug - insertIntoList");
			
		}
		if(NumOfElemInList == lengthOfList) 
		{
			doubleSizeOfArray();
			
			if(debug)
			{
				System.out.println("debug - NumofElemInList is equal to length of list");
				System.out.println("debug - NumofElemInList = " + NumOfElemInList);
				System.out.println("debug - lengthOflist = " + lengthOfList/2);
				System.out.println("debug - Length of array is now: "+orderedIntList.length);
			}

		}
		if(NumOfElemInList == 0)
		{
			orderedIntList[0]= newListInt;
			NumOfElemInList++;
			
			if(debug)
			{
				System.out.println("debug - this is the first element to be inserted in the list");
				System.out.println("debug - " + orderedIntList[0]);
			}
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
					
					if(debug)
					{
						System.out.println("debug - newListInt < orderedIntList[" + listIndex + "]");
						System.out.println("debug - foundInsertPosition should be true " + foundInsertPosition);
					}
				}
				else
				{
					listIndex++;
					holdInsertPosition++;
					
					if(debug)
					{
						System.out.println("debug - listIndex should increment: "+ listIndex);
						System.out.println("debug - holdInsertPosition should increment: " + holdInsertPosition);
					}
				}
			}
			
			for (listIndex = NumOfElemInList; listIndex > holdInsertPosition; listIndex--)
			{
				orderedIntList[listIndex] = orderedIntList[listIndex-1];
				
				if(debug)
				{
					System.out.println("debug - all the postions in array should be shifted");
					System.out.println("debug - print the array: ");
					debug = false;
					printAllValuesInList();
					debug = true;
				}
			}
		
			orderedIntList[holdInsertPosition]= newListInt; 
			NumOfElemInList++;
			
			if(debug)
			{
				System.out.println("debug - orderedIntList[holdInsertPosition] should be newListInt");
				System.out.println("debug - orderedIntList[holdInsertPosition] = " + orderedIntList[holdInsertPosition]);
				System.out.println("debug - newListInt = " + newListInt);
			}
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
		if(debug)
		{
			System.out.println("debug - doubleSizeOfArray");
		}
		
		for (int listIndex = 0; listIndex < NumOfElemInList; listIndex++)
		{
			tempList[listIndex] = orderedIntList[listIndex];
			
			if(debug)
			{
				System.out.println("debug - should be copying all values into new array");
				System.out.println("debug - templist["+listIndex+"] = " + tempList[listIndex]);
				System.out.println("debug - orderedIntList["+listIndex+"] = " + orderedIntList[listIndex]);
			}
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
		if(debug)
		{
			System.out.println("debug - printAllValuesInList");
			
		}
		for (int listIndex = 0; listIndex < NumOfElemInList; listIndex++) 
		{
			if (listIndex % 5 == 0) 
			{
				System.out.println();
			}
			System.out.print(orderedIntList[listIndex] + "\t");	
			
			if(debug)
			{
				System.out.println("debug - orderedIntList[" + listIndex + "] = "+orderedIntList[listIndex]);
			}
		}
		System.out.println();;
	}
}