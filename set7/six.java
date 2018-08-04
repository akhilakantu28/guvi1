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
		Scanner s=new Scanner(System.in);
                  	int n;
                  	int a=0;
                       n=s.nextInt();
                       for(int i=1;i<=n;i++)
                       {
                       	if(n%i==0)
                       	{
                       		a++;
                       	}
                       }
                 
                       if(a==2)
                       {
                       	System.out.println("yes");
                       }
                       else
                       {	System.out.println("no");
                       	
                       }
        
	}
}
