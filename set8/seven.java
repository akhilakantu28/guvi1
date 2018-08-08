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
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	
		
		int a=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			if(a<1)
		            {
			System.out.print(i);
		            }
		            else
		            {  
		            System.out.print(" ");
		            System.out.print(i);
		             }
		             a++;
			
		}
	
	}
}
}
