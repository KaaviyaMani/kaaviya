import java.io.*;
import java.util.*;
public class Primenumber{
  public static void main(String args[])throws IOException{
    Scanner sc=new Scanner(System.in);
    int a,b,flag=0;  
    System.out.println("Enter the number");
    a=sc.nextInt();
    b=a/2;  
      for(int i=2;i<=b;i++)
    {
      
      if(a%2==0)
      {
        
        System.out.println("The number is not prime");
        flag=1;
        break;
      }
      if(flag==0)
      {
        
        System.out.println("The number is prime");
        break;
      }
            }
    }
  }




