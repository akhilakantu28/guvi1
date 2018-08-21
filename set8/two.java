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
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			if( str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
			str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.print("no");
		}
		else
		System.out.print("yes");
	}
}
