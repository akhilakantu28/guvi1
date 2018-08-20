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
		str=str.replaceFirst(Character.toString(str.charAt(0)),
		Character.toString(Character.toUpperCase(str.charAt(0))));
		for(int i=1;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
			{
				str=str.replaceFirst(Character.toString(str.charAt(i+1)),
	            	Character.toString(Character.toUpperCase(str.charAt(i+1))));
		
			}
		}
		System.out.print(str);
	}
}
