import java.io.*;
import java.util.*;
public class Armstrong{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);  
    int a,b,c=0,temp;
    System.out.println("Enter the number");
    a=sc.nextInt();
    temp=a;
    while(a>0)
    {
      b=a%10;
      a=a/10; 
      c=c+(b*b*b);
      
    }
    if(temp==c)
    {
      
      System.out.println("The number is an armstrong number");
    }
    else
    {
      System.out.println("The number is not an armstrong number");
    }
  }
}



 
