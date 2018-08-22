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
		int num,k=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	
		for(int i=2;i<=num;i++)
		{  int count=0;
			while(num%i==0)
		   { 
		   	num=num/i;
			count++;
		   }
		   if(count==0)
		   {
		   	continue;
		   }
		   else
		   {
		   	k++;
		   }
		
		if(k==1)
		{
			System.out.print(i);
		}
		else
		System.out.print(" "+i);
		}
	}
}
