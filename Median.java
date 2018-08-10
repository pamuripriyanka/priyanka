/* package whatever; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
class Median
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int numbers[] ={1,2,3,4,5,6};
    		System.out.println(median(numbers));
	}
	public static int median(int[]x)
	{
		int sum = 0;
		for(int i=0;i<x.length;i++)
		{
			sum += x[i];
		}
		return sum/x.length;
	}
}
