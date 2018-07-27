/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,k;
		int pow=1;
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
	
	for(int i=1;i<=k;i++)
	{
	pow=pow*n;	

	}	
		
	System.out.println(pow);
	}
}
