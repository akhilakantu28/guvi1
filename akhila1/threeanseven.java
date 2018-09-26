import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if((n%3==0)||(n%7==0)){
			System.out.print("yes");
		}
		else if(n%10==0){
			System.out.print("yes");
		}
		else if(((n%10)+7)==14){
			System.out.print("yes");
		}
		else if(((n%10)+3)==6){
			System.out.print("yes");
		}
		else if(((n-100)%3)==0){
			System.out.print("yes");
		}
		else if(((n-100)%7)==0){
			System.out.print("yes");
		}
		else{
			System.out.print("no");
		}
		

		
	}
		
}
