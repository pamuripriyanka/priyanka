/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a=m*n;
		int sqrt=(int)Math.sqrt(a);
		if(sqrt*sqrt==a)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
