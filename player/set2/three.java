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
		int n,res,res1=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		while(n>0)
		{ 
			res=n%10;
		         res1=res1+(res*res);
			n=n/10;
			
		}
		System.out.print(res1);
	}
}
