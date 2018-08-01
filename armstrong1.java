import java.util.*;
import java.lang.*;
import java.io.*;
class armstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num = 371, number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " yes");
        else
            System.out.println(num + " no");
    }
}
