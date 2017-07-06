import java.io.*;
import java.util.*;
public class Palindromenum {
   public static void main(String args[])throws IOException{
	   int a,b,sum=0,temp;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   a=sc.nextInt();
	   temp=a;
	   while(a>0)
	   {
		   b=(a%10);
		   sum=(sum*10)+b;
		   a=a/10;
	   }
	   if(temp==sum)
	   {
		   System.out.println("Number is palindrome");
	   }
	   else
	   {
		   System.out.println("Number is not a palindrome");
	   }
	   
	   
   }
}
