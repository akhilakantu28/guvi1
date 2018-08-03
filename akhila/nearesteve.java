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

		int n,res;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.print(n);
			
			
		}
		else 
		{
			n=n-1;
			if(n%2==0)
			{
			System.out.print(n);
			}
		}
	}
}
