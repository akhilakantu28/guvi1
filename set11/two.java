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
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int n1=0;
	while(n>1)
	{       if(n%2==0)
	         {
		 n1=n/2;
	         }
	         else
	         break;
	         
	      n=n/2;
		
	}   
	
	if(n1>0)
	{
		System.out.print(n1);
	}
	else
	{
		System.out.print(n);	
	}
	}
}
