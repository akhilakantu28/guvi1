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
		int n,x;
		int count=0;
		n=sc.nextInt();
		x=sc.nextInt();
		int a[]=new int[20];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		} 
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			    if(a[i]==a[j])
			     {
				count++;
			     
			      if(count==x)
	                               System.out.print(a[j]);	
			     
			     }
			}
		}
		
	}
}
