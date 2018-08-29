/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int r=0,c=0,num,b;
		Scanner s1=new Scanner(System.in);
		num=s1.nextInt();
		b=num;
		while(num>0)
		{
			if((num%10==0)||(num%10==1))
			c++;
			r++;
			num=num/10;
		}
		if(c==r)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
