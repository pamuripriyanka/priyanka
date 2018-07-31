/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int Number, Count=0;
		 Scanner sc=new Scanner(System.in);
		 sc = new Scanner(System.in);		
		 Number = sc.nextInt();
		while(Number > 0) 
		{
			Number = Number / 10;
			Count = Count + 1; 
    	}
    	System.out.println(Count);
	}
}
