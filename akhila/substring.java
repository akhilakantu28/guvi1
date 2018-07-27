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
		int n,k,sum=0;
		
		int a[] =new int[10];
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		for(int i=0;i<n;i++)
		{
		  a[i]=s.nextInt();
		  if(i<k)
		  {
		  	sum=sum+a[i];
		  
		  }
		
		}	
	
		System.out.println(sum);
	}
}
