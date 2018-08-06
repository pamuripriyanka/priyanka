/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int word=1;
		String str= "I love java Technologies";
		for(int i=0;i<str.length();i++)
		{
		if(str.charAt(i)==' ')
		word++;
		}
		System.out.println(" number of the words="+word);
	

	}
}
