/** @author Alexx Frankos
 * PIN# 25
 * Assignment 2 
 * CSE 360
 * TestAnalytics is the main class that tests OrderedIntlist and Analytics
 * it creates an object of type Analytics.
 * This class calls all the functions in both Analytics and in orderedIntList 
 */
package cse360assign2;

import java.util.Scanner;

public class TestAnalytics 
{
	public static void main (String[] args)
	   {
		boolean debugging = false;
		int debug;
		Analytics list; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you want to debug? enter '0' for no or '1' for yes");
		debug = scan.nextInt();
		
		// debugger
		if(debug == 0)
		{
			debugging = false;
		}
		if(debug == 1)
		{
			debugging = true;
		}
		
		list = new Analytics(debugging);
		
		try
		{
			do
			{
				System.out.println("Please Enter an Integer or A letter to stop");
				int num = scan.nextInt();
				list.insertIntoList(num);
			}
			
			while(scan.hasNextInt()== true);
		}
		//catches the empty list exception
		catch(java.util.InputMismatchException e)
		{
			
		}
		
		//prints the list
		list.printAllValuesInList();
		System.out.println(" ");
		
		//calls the mean function
		System.out.println("the mean: " +list.mean());
		System.out.println(" ");
		
		//calls the median function
		System.out.println("the median:  " + list.median());
		System.out.println(" ");
		
		//calls the high function
		System.out.println("the high is:  " + list.high());
		System.out.println(" ");
		
		// calls the low function
		System.out.println("the low is:  " + list.low());
		System.out.println(" "); 
		
		//calls the numInts function
		System.out.println("the number of Ints is:  " + list.numInt());
		System.out.println(" ");
		
	   }
}


