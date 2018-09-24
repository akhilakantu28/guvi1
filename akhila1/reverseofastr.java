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
		int a=0;
		for(int i=n-1;i>=0;i--)
		{
			if(a<1)
			{
			System.out.print(str.charAt(i));
			}
			else
			{
				System.out.print("-");
				System.out.print(str.charAt(i));
				
			}
			a++;
		}
	}
}
