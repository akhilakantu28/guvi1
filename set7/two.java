/* package whatever; // dont place package name! */

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
		Scanner s=new Scanner(System.in);
		str=s.next();
	int a=0;
		for(int i=0;i<str.length();i++)
		{ 
	            if((str.charAt(i)=='1')||(str.charAt(i)=='0'))
	            {
	            
	            }
	            else
	            {
	            a++;
	            }
		
		}
		if(a==0)
		System.out.println("yes");
		else
		System.out.println("No");
		
		
		
		
		
		
	}
}
