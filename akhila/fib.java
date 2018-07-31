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
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
         int[] a = new int[n];
         a[0] = 1;
         a[1] = 1;
         for(int i=2;i<n;i++)
         {
         	a[i]=a[i-1]+a[i-2];
         }
         
 
         for(int i=0; i<n; i++){
                 System.out.print(a[i] + " ");
         }
	}
	
}
