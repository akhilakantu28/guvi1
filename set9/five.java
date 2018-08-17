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
		String str,str1="",str2="";
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				str1=Character.toString(str.charAt(i));
				System.out.print(str1);
			}
		}
		System.out.print(" ");
			for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
				str2=Character.toString(str.charAt(i));
				System.out.print(str2);
			}
		}
	
		
	}
}
