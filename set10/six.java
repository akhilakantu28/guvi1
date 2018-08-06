/* package whatever; // dont place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	        int A,B,C;
	        int sum=0;
	        Scanner sc=new Scanner(System.in);
	           A=sc.nextInt();
	           B=sc.nextInt();
	           C=sc.nextInt();
	           for(int i=1;i<=C;i++)
	           {
	           	sum=sum+A;
	           A=A+B;
	           }
	           System.out.print(sum);
	       
	      
	
	}
}
