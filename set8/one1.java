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
			// your code goes here
		String str;
		String str1="";
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int n=str.length();
		for(int i=n-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		if(str.equalsIgnoreCase(str1))
		{
			System.out.print("yes");
			
		}
		else
		System.out.print("no");
	
	}
}
