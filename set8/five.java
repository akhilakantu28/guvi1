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
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		StringBuilder sb=new StringBuilder(str);
		int n=str.length();
		 if(n%2!=0)
		 {
		 	sb.setCharAt(n/2,'*');
		 	str=sb.toString();
		 	System.out.print(str);
		 }
		 else
		 {
		 	sb.setCharAt(n/2,'*');
		 	sb.setCharAt(n/2-1,'*');
		 	str=sb.toString();
		 	System.out.print(str);
		 }
	}
}
