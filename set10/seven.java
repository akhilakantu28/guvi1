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
		int rem=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
				System.out.print(rem);
		}
	
	}
}
