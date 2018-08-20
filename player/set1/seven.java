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
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length()-1;i++)
		{
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
			i++;
			
		}
		System.out.print(ch);
	}
}
