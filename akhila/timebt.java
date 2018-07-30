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
		int  hour,min,hour1,min1;
		Scanner s=new Scanner(System.in);
		hour=s.nextInt();
		min=s.nextInt();
		
		hour1=s.nextInt();
		min1=s.nextInt();
		if((hour>hour1)&&(min>=min1))
		{
		int s1=hour-hour1;
		int s2=min-min1;
		
		System.out.print(s1);
		System.out.print(" ");
		System.out.print(s2);
		}
		else
		{
			int s1=hour1-hour;
		int s2=min1-min;
		
		System.out.print(s1);
		System.out.print(" ");
		System.out.print(s2);
		}
			
		
	}
}
