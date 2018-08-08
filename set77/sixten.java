import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int sum=0;
		int n;
		Scanner s=new Scanner(System.in);
		
		n=s.nextInt();
		
	           for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		
		}
	System.out.print(sum);	
	}
}
