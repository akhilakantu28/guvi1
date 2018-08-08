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
	        int a[]=new int[20];
	         n=sc.nextInt();
	       int sum=0;
	      for(int i=0;i<n;i++)
	         {
	         	a[i]=sc.nextInt();
	         }
	        
	         for(int i=0;i<n;i++)
	         {
	         	sum=sum+a[i];
	         }
	System.out.print(sum);	
	}
}
