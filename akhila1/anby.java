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
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='b')
			{
				
			}
			else
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.print("yes");
		}
		else if(count==1)
		{
		System.out.print("yes");	
		}
		else
		{
			System.out.print("no");
		}
	}
}
