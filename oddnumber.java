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
		int n=sc.nextInt();
		int p=sc.nextInt();
		int n1[]=new int[n];
		int a[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++)
		{
			n1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(n1[i]%2!=0)
			{
				a[j]=n1[i];
				j++;
				
			}
		}
		System.out.println(a[p-1]);
	}
}
