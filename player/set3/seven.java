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
		String n;
		Scanner sc=new Scanner(System.in);
		n=sc.next();
		char c;
           String b = "";
            for(int i=0;i<n.length();i++)
          {
              c = n.charAt(i);
              if(c>=65 && c<=90)
              b+=(char)(c+32);
              else
               if(c>=97 && c<=122)
                  b+=(char)(c-32);
                else
                   b+=c;
         }
      System.out.print(b);
	}
}
