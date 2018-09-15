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
		int n1=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int b[]=new int[n1];
		
		for(int i=0;i<n1;i++)
		{
			 b[i]=sc.nextInt();
		}
		int c[]=new int[a.length+b.length];
		int count=0;
		int r=a.length+b.length;
		for(int i=0;i<n;i++)
		{
			c[i]=a[i];
			count++;
		}
		for(int j=0;j<n1;j++)
		{
			c[count++]=b[j];
		}
		Arrays.sort(c);
		for(int i=0;i<r;i++)
		{
		System.out.print(c[i]+" ");
	           }
	           
	}
}
