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
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		char c[]=str.toCharArray();
		Arrays.sort(c);
		int a=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(c[i]==c[i+1])
			{
				a++;
			}
		}
		if(a==0)
		{
			System.out.print("Yes");
			
		}
		else
		{
		System.out.print("No");	
		}
	}

	
}
