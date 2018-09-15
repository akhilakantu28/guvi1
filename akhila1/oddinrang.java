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
		int k=sc.nextInt();
		int sum=0;
		for(int i=n;i<=k;i++)
		{   
			if((i%2)!=0)
			{
		      	sum=sum+i;
			}
		}
		System.out.print(sum);
	}
}
