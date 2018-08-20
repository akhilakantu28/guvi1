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
		String s1,s2;
		int c=0;
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		s2=sc.next();
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				
			}
			else
			{
				c++;
			}
		}
		if(c==1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");	
		}
	}
}
