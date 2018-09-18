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
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<n;i++)
		{  
			int count=1;
			
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count=count+1;
				}
				if(a[i]!=a[j])
				{
					break;
				}
			}
	             	if(count>temp)
	             	{
		               temp=count;
		             }
		}
		System.out.print(temp);
	}
}
