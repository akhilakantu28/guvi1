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
		str=sc.next().toLowerCase();
		if(str.equals("saturday")||str.equals("sunday"))
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
