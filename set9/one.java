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
		int n,m,res;
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		if( (n>=Math.pow(2,32))&&(m>=Math.pow(2,32)) )
		{
			System.out.print("End of file");
		}
		else
		{
			res=n-m;
			System.out.print(res);
		}
		
		
		
	}
}
