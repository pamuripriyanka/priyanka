/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str,strWithoutSpace;
		int i;
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		strWithoutSpace = str.replaceAll(" ", "");
		System.out.println(strWithoutSpace);
		char[] strArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (i=0;i<strArray.length;i++)
		{
            		if( (strArray[i] != ' ') && (strArray[i] != '\t') )
            		{
            			sb.append(strArray[i]);
            		}
		}
	}
}
