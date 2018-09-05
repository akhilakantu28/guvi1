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
		int k=sc.nextInt();
		int n=str.length();
		char a[]=str.toCharArray();
		char b[]=new char[n];
	
		if(k<n)
		{
		int j=n-k;
		for(int i=0;i<k;i++)
		{    
			b[i]=a[j];
			j++;
		}
		int p=0;
		for(int i=k;i<n;i++)
		{
			b[i]=a[p];
			p++;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]);
		}
		}
		else
		{
			System.out.print(str);
			
		}
		
	}
}
