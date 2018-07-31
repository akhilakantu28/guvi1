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
		int k,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		n=n^k;
		k=n^k;
		n=n^k;
		System.out.print(n);
		System.out.print(" ");
		System.out.print(k);
		
	}
}
