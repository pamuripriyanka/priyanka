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
		int N=sc.nextInt();
		int K=sc.nextInt();
		int result=1;
		if(N>=0&&K==0)
    	{
        	result=1;
    	}
    	else if(N==0&&K>=1)
    	{ 
        	result=0;
    	}
    	else
    	{
        	for(int i=1;i<=K;i++)
			{
            		result=result*N;
 			}	    
    	}
    	System.out.println(result);
	}
}
