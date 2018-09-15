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
		Scanner sc=new Scanner(System.in);
 
    int n=sc.nextInt();
    int  bin[]=new int[100];
    int i = 0;
    while(n > 0)
    {
       bin[i++] = n%2;
       n = n/2;
    }
 
    for(int j = i-1;j >= 0;j--)
   {
       System.out.print(bin[j]);
   }
	}
}
