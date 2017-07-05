import java.util.*;
import java.io.*;
public class Main{  
  public static void main(String args[]){  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");  
    int n=sc.nextInt();
    
    if( n>0)
    {
      
      System.out.println("The number is positive");
    }
    else if(n<0)
    {
      
      System.out.println("The number is negative");
      
    } 
    else
    {
      
      System.out.println("The number is zero");
    }
  }
}
