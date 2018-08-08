import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,l,r;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		l=sc.nextInt();
		r=sc.nextInt();
	
		
		if(n>l&&n<r)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
