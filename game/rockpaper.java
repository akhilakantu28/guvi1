/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		// your code goes here
		String name1,name2;
	
		  int ch,ch1;
		   System.out.print("enter the 1 st person name \n");
		   name1=sc.next();
		   System.out.print("enter the 2nd person name\n");
		   name2=sc.next();
		   
		
		   System.out.print("enter your choice \n 1.rock,2.paper,3.seccesor\n");
		   ch=sc.nextInt();
		    
		   ch1=sc.nextInt();
		   
		   
		   	if((ch==1&&ch1==2)||(ch==2&&ch1==3))
		   	{
		   		System.out.print(name2+ " wins the game");
		   	}
		   	else if((ch==1&&ch1==3)||(ch==2&&ch1==3))
		   	{
		   		System.out.print(name1+ " wins the game");
		   	}
		   	else if((ch==2&&ch1==1)||(ch==3&&ch1==1))
		   	{
		   		System.out.print(name2+ " wins the game");
		   	}
		           else if ((ch==3&&ch1==1)||(ch==3&&ch1==2))
		   	{
		   		System.out.print(name1+ " wins the game");
		   	}
		            else
		            {
		            System.out.print("draw");	
		            }
		   
		   
		   
		   
		   
		   
		   
	}
}
