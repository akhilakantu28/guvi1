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
		int fact=1;
		int n=sc.nextInt();
	
		for(int i=1;i<=n;i++)
		{
		fact=i*fact;
		}
		System.out.print(fact);
	}
}
