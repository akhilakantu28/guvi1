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
		int n,count=0,a;
		
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		int temp=n;
		
		while(n>0)
		{
		a=n%10;
		
		count=count+(a*a*a);
		n=n/10;
		}
		if(temp==count)
		System.out.println("yes");
		else
		System.out.println("no");
		
		
	}
}
