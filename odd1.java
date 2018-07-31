/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class oddNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("The Odd Numbers are:");
		for (int i = 1; i <= 6; i++) 
		{
			if (i % 2 != 0) 
			{
				System.out.print(i + " ");
			}
		}
	}
}
