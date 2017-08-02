import java.io.*;
import java.util.*;
public class Count {
public static void main(String args[])throws IOException
{
	int i,t,x=3,y;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter t value");
	t=Integer.parseInt(br.readLine());
	if(t>0)
	{
   for(i=0;i<=t;i++)
   {
	   if(!(t==0))
		{
			 for(i=x;i>0;i--)
	{
		
		System.out.println(i);
	}
	   x=x*2;
	   t--;
		}
   }
	}
	else
	{
		System.out.println("Invalid Input");
	}
}
}
