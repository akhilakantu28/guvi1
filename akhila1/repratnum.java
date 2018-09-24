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
		int a[]=new int[20];
		int i=0;
		int m=0;
		while(n>0)
		{
			int r=n%10;
			m++;
			a[i]=r;
			i++;
			n=n/10;
		}
		
		int count=0;
		for(int k=0;k<m;k++)
		{
			for(int j=k+1;j<m;j++)
			{
				if(a[k]==a[j])
				{
				count++;
				break;
				}
				else
				{
				  	
				}
			}
			
		}
		if(count==0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
	}
}
