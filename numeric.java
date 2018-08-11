/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class numeric
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean numeric = true;
		try 
		{
            		Double num = Double.parseDouble(s);
		} 
		catch (NumberFormatException e) 
		{
            		numeric = false;
		}

		if(numeric)
            		System.out.println("yes");
		else
            		System.out.println("No");
	}
}
