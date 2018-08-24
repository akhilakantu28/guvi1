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
		str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{         if(count==0)
		          {
		           	if(str.charAt(i)==' ')
			        {
			             	count++;
			             	continue;
			        }
		          }
		          System.out.print(str.charAt(i));
		}
	}
}
