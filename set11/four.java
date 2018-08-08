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
		int n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	            k=sc.nextInt();
		
	int pow=1;
	for(int i=1;i<=k;i++)
	{
	     pow=pow*n;
			
		
	}
	System.out.print(pow);
		            
}
}
