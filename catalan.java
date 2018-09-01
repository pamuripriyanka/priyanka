/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CatalnNumber
{
	int catalan(int n) 
	{
		int res=0;
		if (n<=1) 
		{
            		return 1;
		}
		for (int i=0;i<n;i++) 
		{
            		res +=catalan(i)*catalan(n-i-1);
		}
		return res;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		CatalnNumber cn=new CatalnNumber();
		for (int i=0;i<n+1;i++) 
		{
            		System.out.print(cn.catalan(i)+" ");
		}
	}
}
