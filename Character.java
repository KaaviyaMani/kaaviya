import java.util.*;
import java.io.*;
public class Character{
  
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i =0;
    System.out.println("Enter the character");
    char c=(char)br.read();
  
    switch(c){
      
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
      i++;
      }
      if(i==1)
      {
        System.out.println("The character is vowel");
        }
        else {
          

        System.out.println("The character is constant");
        }
        }}


      
      
      
      
    
