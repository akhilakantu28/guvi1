/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static int fact(int n)
	{
		int fact=1;
		for(int j=1;j<=n;j++)
		{
		  fact=fact*j;	
		}
		return fact;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n,r;
		n=sc.nextInt();
		r=sc.nextInt();
		int res=fact(n)/fact(n-r);
		System.out.print(res);
	}
}
