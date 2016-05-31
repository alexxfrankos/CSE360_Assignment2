package cse360assign2;

import java.util.Scanner;

public class assignment2 {
	public static void main (String[] args)
	   {
		boolean debugging = false;
		int debug;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you want to debug? enter '0' for no or '1' for yes");
		debug = scan.nextInt();
		
		if(debug == 0)
		{
			debugging = false;
		}
		if(debug == 1)
		{
			debugging = true;
		}
		
		Analytics list = new Analytics(debugging);
		
		try{
			do{
				System.out.println("Please Enter an Integer or A letter to stop");
				int num = scan.nextInt();
				list.insertIntoList(num);
			}while(scan.hasNextInt()== true);
		}
		catch(java.util.InputMismatchException e)
		{
			
		}
		

		
		list.printAllValuesInList();
		
		System.out.println(" ");
		
		System.out.println("the mean: " +list.mean());
		System.out.println(" ");
		
		System.out.println("the median:  " + list.median());
		System.out.println(" ");
		
		System.out.println("the high is:  " + list.high());
		System.out.println(" ");
		
		System.out.println("the low is:  " + list.low());
		System.out.println(" "); 
		
		System.out.println("the number of Ints is:  " + list.numInt());
		System.out.println(" ");
		
		
	   }
}

