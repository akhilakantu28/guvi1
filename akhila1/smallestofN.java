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
		int n;
		int m=0;
		n=sc.nextInt();
		int a[]=new int[20];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
			if(a[i]<n)
			{           if(m<1)
			           {
				System.out.print(a[i]);
			           }
			           else
			           {
			           		System.out.print(" ");
			           		System.out.print(a[i]);
			           	
			           }
			           m++;
			}
		}
	}
}
