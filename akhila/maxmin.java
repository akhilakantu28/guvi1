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
		int a[]=new int[30];
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int min=a[0];
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			
			
		          if(max<a[i])
		          max=a[i];
		}
		for(int i=0;i<n;i++)
		{
			
			
		          if(min>a[i])
		          min=a[i];
		}
		
		          System.out.print(min);
		         System.out.print(" ")
				System.out.print(max);
		
	}
}
