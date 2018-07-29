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
			int N;
		int a[],min;
	           a=new int[20];
		
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		
		for(int i=0;i<N;i++)
		
		{
	                     a[i]=s.nextInt();
			
		}
		min=a[0];
		for(int i=0;i<N;i++)
		{
			if(min>a[i])
			  min=a[i];
		
		}
			
	
		System.out.println(min);
		
	}
}
