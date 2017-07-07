import java.io.*;
import java.util.*;
public class Primenumprint{
  
  public static void main(String args[])throws IOException{
    Scanner sc=new Scanner(System.in);
    int a,b,i=0,j=0,cou=0;
    char []c=new char[200];
    System.out.println("Enter the Starting number");
    a=sc.nextInt();
    System.out.println("Enter the Ending number");
    b=sc.nextInt();
    for(i=a;i>=a&&i<=b;i++)
    {
      if(i<=1)
      {
        
        i=2;
      }
      
      int m=i/2;
      for(j=2;j<m;j++)
      {
        
        if(i%j==0)
        {
          
          c[i]=1;
          break;
        }
      }
      if(c[i]==0)
      {
        System.out.println(i);
        
      }
    }
  
  }
}




    
    
    
    
  
