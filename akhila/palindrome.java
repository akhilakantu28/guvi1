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
		int n,a,rem=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int temp=n;
		while(n>0)
		{
			a=n%10;
			rem=(rem*10)+a;
			n=n/10;
		}
		
		if(temp==rem)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
			
		}
		
	}
}
