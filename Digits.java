import java.io.*;
import java.util.*;
import java.lang.*;
public class Digits
{
    public static void main(String args[])throws IOException
    {
        int sum=0,sum1=0,sum2=0,m=1;
        int a=0,i,j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the input:");
        int g=Integer.parseInt(br.readLine());
        List<Integer>list=new ArrayList<Integer>();
        
    if(g>9)
        {
        String s=Integer.toString(g);
        int l=s.length();
       for(i=0,j=l;i<l&&j>0;i++,j--)
       {
          
         char n=s.charAt(i);
             a=Character.getNumericValue(n);
            sum=sum+a;
             sum1=sum;
            sum1=sum1-a;
            list.add(sum1);
         }
      
      for(int x:list)
      {
          sum2=sum2+x;
      }
       
    System.out.println("The sum of digits is:"+(sum+sum2));
         }
    else if(g<=9)
    {
        System.out.println("Enter a value greaterthan 9");
    }
    }
} 
    
