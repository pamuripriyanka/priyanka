/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class uppercase
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		String line=in.nextLine();
		String upper_case_line=""; 
    		Scanner scan=new Scanner(line); 
		while(scan.hasNext()) 
		{
            		String word=scan.next(); 
            		upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
		}
    		System.out.println(upper_case_line.trim()); 
	}
}
