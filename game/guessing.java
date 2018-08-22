/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//  your code goes here
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("enter a number\n");
	
		
		Random rand = new Random();
	            int count=0;
	            int num=rand.nextInt(10);
	            System.out.println(num);
	              for(int i=0;i<3;i++)
	                 
	             {     
	                 	
	                 n=sc.nextInt(); 
	                 System.out.println(n);
	   	
	   	   if(n==num)
	   	   {
	                count++;
	                break;
	                }
	           	 else
	   	 {
	   	  	
	           	}
	   	
	         }
	  if(count==0)
	  {
	  	System.out.print("losses the  game");	
	  }
	  else
	  {
	  	System.out.print("wins the  game");	
	  }
	  
		
		
		
	}
}
