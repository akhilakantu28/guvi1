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
		int count=0;
        String str;
        str=sc.nextLine();
  for(int i=0;i<str.length();++i)
  {
   if(str.charAt(i)==' ')
   {
   continue;
   }count++;
  }
 System.out.println(count);
  
 
	}
}
