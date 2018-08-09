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
		int n,k,temp;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[20];
		n=sc.nextInt();
		k=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			a[i]=sc.nextInt();
		}
	 	for(int i=1;i<=n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	System.out.print(a[k]);
	
	}
}
