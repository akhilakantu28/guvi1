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
		int i ,n=5;
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		
		for(int j=1;j<=n;j++)
		{
			int res =i*j;
			System.out.print(res +" ");
		}
	}
}
