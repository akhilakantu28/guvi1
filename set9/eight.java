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
		int n1,n2,x,lcm=1;
		int max,min;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		if(n1>n2)	
		{           max=n1;
			min=n2;
			
		}
		else
		{
			max=n2;
			min=n1;
		}
		for(int i=1;i<=min;i++)
                        {
                            x=max*i; 
                        if(x%min==0) 
                           {
                           lcm=x;
                          break; 
                          }
                        }
                        System.out.println(lcm);
		
	}
}
