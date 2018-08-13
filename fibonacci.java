* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class fibonacci
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,a=1,b=1,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.print(" ");
		n=sc.nextInt();
		System.out.print(" ");
		for(int i=1;i<=n;i++)
		{
            		a=b;
            		b=c;
            		c=a+b;
            		System.out.print(a+" ");
		}
	}
}
