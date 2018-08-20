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
		int m=0;
		for(int i=n;i<=k;i++)
		{    
			int l=0;
			for(int j=1;j<=i;j++)
			{
		             	if(i%j==0)
		            	{
				l++;
			           }
			}
			if(l==2)
			{
			m++;	
		            
			}  	
		              
		}
		
		System.out.print(m);
	}
}
