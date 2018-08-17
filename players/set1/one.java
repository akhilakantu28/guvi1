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
		String str1="";
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int n=str.length();
		for(int i=n-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
	
			System.out.print(str1);
		
	}
}
