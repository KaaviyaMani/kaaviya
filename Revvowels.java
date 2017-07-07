 import java.io.*;
 import java.util.*;
 public class Revvowels{
    public static void main(String args[])throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String c,d;
       System.out.println("Enter the string");
       String a=br.readLine();
        StringBuilder b=new StringBuilder(a);
        b=b.reverse();
        System.out.println(b);
        c=b.toString();
       d=c.replaceAll("[aeiouAEIOU]","");
        System.out.println(d);
        }
        }
       


 
