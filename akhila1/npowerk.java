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
	    int rem=1,m=0;
	    while(n>=rem)
	    {      rem=rem*k;
	    	if(rem==n)
	    	{
	    		m++;
	    		System.out.print("yes");
	    		break;
	    	}
	    }
	    
	    if(m==0)
	    {
	    	System.out.print("no");
	    }
	    
	}
}
