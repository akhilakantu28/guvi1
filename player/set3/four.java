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
		String s; 
		boolean b;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
	           
	            b=(s.matches("-?\\d+(\\.\\d+)?"));
		if(b)
		
		{
			
			System.out.print("yes");
		
			
		}
		else
		{          
			System.out.print("no");
		}
		
	}
}
