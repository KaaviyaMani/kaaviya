import java.io.*;
import java.util.*;
public class Deletingnum {
 public static void main(String args[])throws IOException{
	 char c;
		int i,a;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<Integer>list=new ArrayList<Integer>();
		System.out.println("Enter the number");
		String s=br.readLine();

		System.out.println("Enter the number of digits to be deleted");
		int n=Integer.parseInt(br.readLine());
		
		for(i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			a=Character.getNumericValue(c);
			list.add(a);
		}
		Collections.sort(list);
		
		
		for(i=0;i<n;i++)
		{
			
		    list.remove(list.size()-1);
		}
	for(int x:list)
		{
			System.out.print(x);
	}
 }
}
