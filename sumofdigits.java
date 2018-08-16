/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int getSum(int n)
	{    
		int sum=0;
		while (n!=0)
		{
            		sum=sum+n%10;
            		n=n/10;
		}
    		return sum;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(getSum(n));
	}
}
