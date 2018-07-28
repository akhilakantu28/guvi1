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
		int n,k,count=0,a;
		
		Scanner s=new Scanner(System.in);
		//System.out.println("enter a values");
		n=s.nextInt();
		k=s.nextInt();
	
		for(int i=n+1;i<k;i++)
		{
			int temp=i;
	             	while(temp>0)
		            {
	               	a=temp%10;
		           count=count+(a*a*a);
		           temp=temp/10;
	                 	}
	                      	if(count==i)
	                      	{
	                      
	                          System.out.println(i);
	                    	}
	                    
		          count=0;
		
		}
	}
}
