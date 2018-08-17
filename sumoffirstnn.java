/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int findSum(int n)
	{
		int sum = 0;
		for (int x = 1; x <= n; x++) 
            	sum=sum+x;
        		return sum;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(findSum(n));
	}
}
