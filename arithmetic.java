/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arithmetic
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		double firstTerm = 0;
    		double numberOfTerms = 0;
    		double commonDifference = 0;
    		double  sum= 0;
    		double term = 0;
			System.out.print("Enter the value of a (First Term) : "); 
    	firstTerm = input.nextDouble();
			System.out.print("Enter the value of d (Common Difference) : "); 
    	commonDifference = input.nextDouble();
			System.out.print("Enter the value of n (Number of terms) : "); 
    	numberOfTerms = input.nextDouble();
		sum = numberOfTerms * (2 * firstTerm + (numberOfTerms - 1) * commonDifference)/2;
		System.out.println("");
		for(int i = 0; i < numberOfTerms; i++)
		{
    			term = firstTerm + i * commonDifference;
    			System.out.print(term+" + ");
    		}
		System.out.println("...");
    		System.out.println("The Sum of n terms of series : " + sum);
	}
}
