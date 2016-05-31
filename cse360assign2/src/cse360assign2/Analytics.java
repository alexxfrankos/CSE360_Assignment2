/**
 * @author Alexx Frankos
 * PIN# 25
 * Assignment 2 
 * CSE 360
 * Analytics is a class that extends OrderedIntlist, it has five methods; 
 * mean, median, high, low, and numInt
 */
package cse360assign2;

public class Analytics extends OrderedIntList
{
	private boolean debug = false;
	/** Analytics 
	 * is the constructor that initializes the debug setting to true or false
	 * it also makes a call to the super constructor 
	 * 
	 * @param debugging
	 * is a parameter that sets debugging to true or false
	 */
	
	public Analytics(boolean debugging)
	{
		super();
		debug = debugging;
	}
	
	/** Mean
	 * is a method that adds up all the values in 
	 * the orderedIntlist and divides that number by 
	 * the total number of integers in the orderedIntList
	 * 
	 * @return
	 * this returns the mean or '-1' if the list is empty
	 */
	
	public double mean()
	{
		double sum = 0;
		
		//if statement for debugging
		if(debug== true)
		{
			System.out.println("debug - Mean function ");
			System.out.println("debug - sum should be 0: " + sum);
			System.out.println("debug - NumOfElemInList: " + NumOfElemInList);
			System.out.println(" ");
		}
		
		if(NumOfElemInList == 0)
		{
			//if statement for debugging
			if(debug== true)
			{
				System.out.println("debug - NumOfElemInList: " + NumOfElemInList);
				System.out.println("debug - if NumOfElemInList is 0, should return '-1'");
			}
			sum = -1;
		}
		else
		{
			for(int index = 0; index < NumOfElemInList; index++)
			{
				sum = sum + orderedIntList[index];
				//if statement for debugging
				if(debug)
				{
					System.out.println("debug - Sum = " + (sum-orderedIntList[index]) + " orderedIntList[" + index + "] = " + orderedIntList[index]);
					System.out.println("  ");
					System.out.println("debug - Sum + " + " orderedIntList[" + index + "] = " + sum  );
				}
			}
			sum = (sum/NumOfElemInList);
		}
		
		return sum;
		
	}
	/** median
	 * is a method that returns the median in the array of numbers
	 * found in the orderedIntlist
	 * 
	 * @return
	 * it returns '-1' if the list is empty
	 * if the list has an even number of elements it returns the mean of the middle elements
	 * if the list has an odd number of elements it returns the middle number in the list
	 */
	public int median()
	{
		int returnAnswer = 0;
		
		//if statement for debugging
		if(debug== true)
		{
			System.out.println(" ");
			System.out.println("debug - Median function ");
			System.out.println("debug - returnAnswer should be 0: " + returnAnswer);
			System.out.println("debug - NumOfElemInList: " + NumOfElemInList);
		}
	
		if(NumOfElemInList == 0)
		{
			
			returnAnswer = -1;
			//if statement for debugging
			if(debug== true)
			{
				System.out.println("debug - NumOfElemInList is: " + NumOfElemInList);
				System.out.println("debug - The returnAnswer should be '-1': " + returnAnswer);
			}
		}
		if(NumOfElemInList % 2 == 0 && NumOfElemInList != 0)
		{
			returnAnswer = (orderedIntList[(NumOfElemInList/2)-1] + orderedIntList[(NumOfElemInList/2)])/2;
			
			//if statement for debugging
			if(debug== true)
			{
				System.out.println("debug - NumOfElemInList is an even number");
				System.out.println("debug - returnAnswer: " + returnAnswer);
				
			}
		}
		if(NumOfElemInList % 2 != 0)
		{
			int medianIndex = (NumOfElemInList +1)/2;
			returnAnswer = orderedIntList[medianIndex -1];
			
			//if statement for debugging
			if(debug== true)
			{
				System.out.println("debug - NumOfElemInList is an odd number");
				System.out.println("debug - returnAnswer: " + returnAnswer);
				
			}
			
		}
		return returnAnswer;
		
		
	}
	/** high
	 * it finds the largest number in the orderedIntlist
	 * @return
	 * if the list is empty it returns '-1'
	 * if the list has at least one elements is returns the last element in the list
	 */
	public int high()
	{
		int returnValue = 0;
		
		//if statement for debugging
		if(debug== true)
		{
			System.out.println(" ");
			System.out.println("debug - High function");
			try{
				System.out.println("debug - last element in list: " + orderedIntList[NumOfElemInList - 1]);
			}
			catch(java.lang.ArrayIndexOutOfBoundsException e)
			{
				System.out.println("debug - the array is empty, should return '-1'");
			}
			
			
		}
		if(NumOfElemInList == 0)
		{
			
			returnValue = -1;
			//if statement for debugging
			if(debug== true)
			{
				System.out.println("debug - numOfElemInList is '0'");
				System.out.println("debug - returnValue should be '-1': " + returnValue);
			}
		}
		else
		{
			returnValue = orderedIntList[NumOfElemInList - 1]; 
			
			//if statement for debugging
			if(debug== true)
			{
				System.out.println("debug - numOfElemInList more than '0'");
				System.out.println("debug - returnValue should not be '-1': " + returnValue);
				System.out.println("debug - unless last element is '-1', last element is: "+ orderedIntList[NumOfElemInList - 1] );
			}
		}
		return returnValue;
	}
	/** low
	 * is a method that finds the smallest number in the orderedIntlist
	 * @return
	 * if the list is empty it returns '-1'
	 * if the list has at least one element it returns the first element in the orderedIntList 
	 */
	public int low()
	{
        int returnValue = 0;
        
      //if statement for debugging
        if(debug== true)
		{
			System.out.println(" ");
			System.out.println("debug - low function");
		}
		if(NumOfElemInList == 0)
		{
			returnValue = -1;
			
			//if statement for debugging
			if(debug== true)
			{
				System.out.println("debug - the list is empty ");
				System.out.println("debug - returnValue should be '-1': " + returnValue);
			}
		}
		else
		{
			
			returnValue = orderedIntList[0]; 
			
			//if statement for debugging
			if(debug== true)
			{
				System.out.println("debug - the list is not empty ");
				System.out.println("debug - returnValue should be the same as array[0]: ");
				System.out.println("debug - returnValue: "+ returnValue + "  " + "Array[0]: " + orderedIntList[0]);
			}
		}
		return returnValue;
	}
	/** numInt
	 * is a method that finds the number of elements in the orderedIntlist
	 * @return
	 * it returns the number of elements that populate the orderedIntList
	 * if the list is empty it returns '-1'
	 */
	public int numInt()
	{
		//if statement for debugging
		if(debug== true)
		{
			System.out.println(" ");
			System.out.println("debug - numInt function");
			System.out.println("debug - numInt should be: " + NumOfElemInList);
		}
		return NumOfElemInList;
	}

}
