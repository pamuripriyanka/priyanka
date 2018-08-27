import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(!Character.isDigit(str.charAt(i))&&!Character.isAlphabetic(str.charAt(i))&&str.charAt(i)!='_')
			{
				count++;
			}	
		}
		System.out.println(count);
	}
}
	
