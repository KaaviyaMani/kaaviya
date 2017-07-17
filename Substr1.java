import java.io.*;
import java.util.*;
public class Substr1{
   public static void main(String args[])throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
      String a,b;
      int flag =0;
      char d,d1,e=0,e1=0;
      int s,s1,i,j;
      System.out.println("Enter the first input");
      a=br.readLine();
      System.out.println("Enter the second input");
      b=br.readLine();
      char []c=a.toCharArray();
      char[]c1=b.toCharArray();
       s=a.length();
      s1=b.length();
      for(i=0;i<s-1;i++)
      {
          d=c[i];
          d1=c[i+1];
         
         
         for(j=0;j<s1-1;j++)
         {
                e=c1[j];
                e1= c1[j+1];
          }
          if((d==e)&&(d1==e1))
          {
              flag=1;
             System.out.println("It is a substring");
             break;
             }
             
             if( flag==1)   {
               
      
             break;
             }
             }
             if(flag==0)
             {
                System.out.println("It is not a substring");
                }

         }
         }                              


      
 
