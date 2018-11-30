/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static double fact(double n)
	{
		double n1=n;
		double res=1;
		for(int i=1;i<=n1;i++)
		{
			res=res*i;
		}
		return res;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		//BigInteger n=new BigInteger(sc.next());
		  double n=sc.nextInt();
		
	double r=2;
		 double  m=fact(n);
		double m1=fact(n-r);
		double res=m/(m1*r);
		System.out.print(res);
	}
}
