import java.io.*;
import java.util.*;
class Fact{  
  public static void main(String args[]){  
     Scanner sc= new Scanner(System.in);  
    int i,fact=1;  
    int n; 
    System.out.println("Enter the Nnumber");
     n=sc.nextInt();   
    for(i=1;i<=n;i++){    
      fact=fact*i;    
    }    
    System.out.println("Factorial is"+fact);    
  }  
}  
