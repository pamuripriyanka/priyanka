/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n,m,a=0,x;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=n;
		while(n>0)
		{
            		x=n%10;
            		a=a*10+x;
            		n=n/10;
		}
		if(a==m)
		{
            		System.out.println("yes");
		}
	 
		 else
		 {
            		System.out.println("no");
		 }		
	}
}
