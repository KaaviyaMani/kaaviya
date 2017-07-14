
import java.io.*;
import java.util.*;
public class Subsetint{
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String a,b;
    int i,n,n1;
    boolean result;
    System.out.println("Enter the first array value");
    n=Integer.parseInt(br.readLine());
    System.out.println("Enter the first array element");
    List<String>list=new ArrayList<String>();
    for(i=0;i<n;i++)
    {
      a=br.readLine();
      list.add(a);
    }
    System.out.println("Enter the second array value");
    n1= Integer.parseInt(br.readLine());
    List<String>list1=new ArrayList<String>();
    System.out.println("Enter the second array element");
    for(i=0;i<n1;i++)
    {
      b=br.readLine();
      list1.add(b);
    }
    if(n<n1)
    {
      result=list1.containsAll(list);
    }
    else
    {
      result=list.containsAll(list1);
    }
    if(result==true)
    {
      System.out.println("The integer is subset");
    }
    else
    {
      System.out.println("The integer is subset");
    }
  }
}
      
      
      
      
      
    
