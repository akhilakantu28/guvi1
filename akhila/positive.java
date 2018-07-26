import java.util.Scanner;
import java.util.*;

class positive
{
public static void main(String args[])
{
int num;
Scanner s=new Scanner(System.in);
num=s.nextInt();
if(num>0)
{
System.out.println(" Positive");

}
else if(num<0)
System.out.println(" Negative");
else{
System.out.println(" zero");	
}
}
}
