/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class evennumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//define limit
		int limit = 9;
		System.out.println("Printing Even numbers between 6 and " + limit);
		for(int i=7; i <= limit; i++)
		{
			// if the number is divisible by 2 then it is even
			if( i % 2 == 0)
			{
				System.out.print(i + " ");
			}
		}
	}
	
}
