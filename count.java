/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String input = "laptap is good";
		int count=0;
		for(int i=0;i<input.length();i++) 
		{
			if (input.charAt(i)!=' ') 
			{
				++count;
			}
		}
		System.out.println(count);
	}
}
