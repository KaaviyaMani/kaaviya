import java.io.*;
import java.util.*;
public class Numberonce{
  
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,a,s;
    String b=null;
    System.out.println("Enter the value");
    a=Integer.parseInt(br.readLine());
    List<String>list=new ArrayList<String>();
    Set<String>list1=new HashSet<String>();
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
        if(s<2)
        {
          list1.add(s1);
          
        }
      }  
      System.out.println("The unique number is");
      for(String s2:list1)
      {
        System.out.println(s2);
      }
    }
    else
    {
      
      
      System.out.println(b);
    }
  }
}
                     
                     

                 
                 



      

