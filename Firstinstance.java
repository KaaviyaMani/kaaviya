import java.io.*;
import java.util.*;
public class Firstinstance{
  
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,a,s;
    String b=null;
    System.out.println("Enter the value");
    a=Integer.parseInt(br.readLine());
    List<String>list=new ArrayList<String>();
    System.out.println("Enter the numbers");
    for(i=0;i<a;i++)
    {
      b=br.readLine();
      list.add(b);
    }
    if(a>1)
    {
      
      
      for(String s1:list)
      {
        
        s=Collections.frequency(list,s1);
        if(s>1)
        {
          System.out.println("The first Instance of repeated element is "+s1);
           break;
        }
        }
        }
        }
        }
