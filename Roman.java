import java.io.*;
import java.util.*;
public class Roman{
 
 public static void main(String args[])throws IOException{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String s,str;
   int i,res=0;
   int[] x=new int[100] ;
   System.out.println("Enter the roman number");
   s=br.readLine();
   str=s.toUpperCase();
   char[]c=str.toCharArray();
   Map<Character,Integer>map=new HashMap<Character,Integer>();
   map.put('I',1);
   map.put('V',5);
   map.put('X',10);
   map.put('L',50);
   map.put('C',100);
   map.put('D',500);
   map.put('M',1000);  
   for(i=0;i<s.length();i++)
   {
     
     x[i]=map.get(c[i]);
     }
     for(i=0;i<s.length();i++)
     {
       if(x[i]<x[i+1])
       {
         res=res+x[i]-(2*x[i]);
         }
         else
         {
           
           res=res+x[i];
           }
     
     }
     System.out.println(res);
     }
}
