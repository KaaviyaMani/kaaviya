 import java.io.*;
import java.util.*;
public class Reverse11{
  
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter the string");
    String s=br.readLine();
    StringBuilder b=new StringBuilder(s);
    b=b.reverse();
    System.out.println(b);
    
  }
}
