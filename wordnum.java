/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String h[]=s.split("\\;");
		for(int i=0;i<h.length;i++)
		{
	 	     System.out.printf("%s",h[i]);
		}
	}
}
