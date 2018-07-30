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
		int n, hour,min;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		hour=n/60;
		min=n%60;
		
		System.out.print(hour);
		System.out.print(" ");
		System.out.print(min);
	}
}
