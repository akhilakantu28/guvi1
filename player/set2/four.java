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
		int n ;
		String str,s2="";
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		str=sc.next();
		if(str.length()==n)
		{
			String s1=str.replaceAll("[aeiouAEIOU]+","");
			int m=s1.length();
			for(int i=m-1;i>=0;i--)
			{
				s2=s2+s1.charAt(i);
			}
			System.out.print(s2);
		}
		else
		{
			
		}
			
		
		
		
	}
}
