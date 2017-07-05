import java.io.*;
import java.util.*;
public class Largernumber{
  
  public static void main(String args[])throws IOException{
     Scanner sc=new Scanner (System.in);  
     System.out.println("Enter the numbers");
                      int a=sc.nextInt();
                      int b=sc.nextInt();
                      int c=sc.nextInt();
                      int max=0;
                      if(a>b)
                      {
                        
                        max=a;
                        }
                        else if (b>c){
                                     max=b;
                        } 
                        else if(c>max){
                          
                          max=c  ;
      
                        } 
                       
                       System.out.println("The larger number is "+max);
    
                      
                }}
              

    
    

