import java.io.*;
import java.util.*;
public class Resbill {
public static void main(String args[])throws IOException
{
	String item,cost;
	int noItem,avoided,value,money;
	int total = 0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	List<Integer>list=new ArrayList<Integer>();
	System.out.println("Enter the number of items and avoided dish number");
	item=br.readLine();
	noItem=Character.getNumericValue(item.charAt(0));
	avoided=Character.getNumericValue(item.charAt(2));
	
	System.out.println("Enter the cost of each item");
	cost=br.readLine();
	System.out.println("Enter the money brian charged for Anna");
	money=Integer.parseInt(br.readLine());
	String[] costs=cost.split(" ");
	for(String s:costs)
	{
		value=Integer.parseInt(s);
		list.add(value);
	}
	list.remove(avoided);
	for(int i:list)
	{
		total=total+i;
	}
	if(total/2==money)
	{
		System.out.println("Bon Appetit");
	}
	else
	{
	System.out.println(Math.abs(total/2-money));
	}
}
}
