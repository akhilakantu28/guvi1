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
		int a[]=new int[20];
		int n,temp;
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"  ");
		}
		
	}
}
