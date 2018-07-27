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
		char ch;
		Scanner s =new Scanner(System.in);
		ch =s.next().charAt(0);
		
		if(ch>=65&&ch<=122)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				System.out.println("Vowel");
				
			}
		
			else
			{
				System.out.println("Consonant");	
			}
		
		}
		else
		{
			System.out.println("invalid");
		}
		
		
		
	}
}
