import java.io.*;
import java.util.*;
public class Alphabet{
  
  public static void main(String args[])throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the character");
            char c=(char)br.read();
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z') )
            {
              
              System.out.println("It is an Alphabet");
              }
              else
              {
                
                System.out.println("Not an Alphabet");
                }
                }}
              

    
    

