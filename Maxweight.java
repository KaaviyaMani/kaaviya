import java.io.*;
import java.util.*;
public class Maxweight {
public static void main(String args[])throws IOException
{
	String values;
	int elephant,web,i;
	int weight = 0,count=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number of elephants and maximum weight");
	values=br.readLine();
	String[] value=values.split(" ");
	elephant=Integer.parseInt(value[0]);
	web=Integer.parseInt(value[1]);
	String weights=br.readLine();
	String[] value1=weights.split(" ");
	int[]elephants=new int[elephant];
	for(i=0;i<elephant;i++)
	{
		elephants[i]=Integer.parseInt(value1[i]);
	}
	Arrays.sort(elephants);
	for(int x:elephants)
	{
		weight=weight+x;
		count++;
		if(weight>web)
		{
		 count--;
		 break;
		}
	}
	System.out.println(count);
}
}
