/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str;
		int a=0;
		int b=0;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				a++;
			}
			if(Character.isLetter(str.charAt(i)))
			{
				b++;
			}
		}
		if((a>=1)&&(b>=1))
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");	
		}
	}
}
