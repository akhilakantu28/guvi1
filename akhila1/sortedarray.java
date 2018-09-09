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
		int n;
		int count=0;
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		int a[]=new int[20];
		for(int i=0;i<n;i++)
		{
			
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			if(a[i]<a[i+1])
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
		else
		{
	             	System.out.print("no");
		}
	
		
	}
}
