/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static boolean isDivisibleBy7(int num)
	{
		if(num<0)
		return isDivisibleBy7(-num);
		if(num==0||num==7)
			return true;
			if(num<10)
			return false;
			return isDivisibleBy7(num/10-2*(num-num/10*10));
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isDivisibleBy7(num))
			System.out.println("yes");
			else
			System.out.println("no");
	}
}
