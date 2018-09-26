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
		
		int i=0;
			int a[]=new int[20];
			int n1=0;
		while(n!=0)
		{
			n1=n%10;
			a[i]=n1;
			n=n/10;
			i++;
			
		}
		int count=i;
			
		int sum=0;
		for(int j=0;j<=count;j++)
		{
				
				sum=sum+a[j];
				j++;
			
		}
		if((sum%2)==0)
		{
			System.out.print("E");
		}
		else
		{
			System.out.print("O");
		}
		
	}
}
