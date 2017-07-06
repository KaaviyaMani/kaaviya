 import java.io.*;
 import java.util.*;   
public class Swapstr{
  
  public static void main(String args[])throws IOException{
    Scanner sc = new Scanner(System.in);
    char temp=' ';
    System.out.println("Enter the String");
    int i=sc.nextInt();
    String s=String .valueOf(i);
    char[] c = s.toCharArray();
     int l=s.length();
    if(l>1)
    {
      
      for(i=0;i<l-1;i++)
      {
        
        temp=c[i];
        c[i]=c[i+1];
        c[i+1]=temp;
        i++;
        }
       
        String s1=new String (c);
        System.out.println(s1);
        }
        else
        {
          
          System.out.println(s)
          }
          }
          }
        
    
  
