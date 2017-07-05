import java.io.*;
import java.util.*;
public class Integer{
  public static void main(String args[])throws IOException{
    //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the Integer");
    int i=sc.nextInt();
    //int i=Integer.parseInt(br.readLine());
    String s= String.valueOf(i);
    StringBuilder b=new StringBuilder(s);
    b=b.reverse();
    System.out.println(b);
  }
}

