/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int avg=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			avg=avg+a[i];
		}
		System.out.println(avg/n);
	}
}
