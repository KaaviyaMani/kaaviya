import java.io.*;
import java.util.*;
public class Alpspl {
public static void main(String args[])throws IOException
{
	String word;
	int i,small,large,digit,square;
	int s1 = 0,s2=0,sum1 = 0,sum2=0,sum3=0,sum4=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	List<Integer>list=new ArrayList<Integer>();
	System.out.println("Enter the input");
	word=br.readLine();
	
	for(i=0;i<word.length();i++)
	{
		if(word.charAt(i)>=48&&word.charAt(i)<=57)
		{
			list.add(word.charAt(i)-48);
		}
	}
	if(list.size()==0)
	{
		System.out.println("No numbers present");
	}
	else
	{
	for(int number:list)
	{
		large=Collections.max(list);
		small=Collections.min(list);
		s1=s1+number*large;
		s2=s2+number*small;
	}
	String str1=String.valueOf(s1);
	for(i=0;i<str1.length();i++)
	{
		sum1=sum1+Character.getNumericValue(str1.charAt(i));
	}
	String str2=String.valueOf(s2);
	for(i=0;i<str2.length();i++)
	{
		sum2=sum2+Character.getNumericValue(str2.charAt(i));
		}
	if(sum1>9)
	{
		 String str3=String.valueOf(sum1);
		for(i=0;i<str3.length();i++)
		{
			sum3=sum3+Character.getNumericValue(str3.charAt(i));
		}
		sum1=sum3;
	}
	if(sum2>9)
	{
		 String str4=String.valueOf(sum2);
		for(i=0;i<str4.length();i++)
		{
			sum4=sum4+Character.getNumericValue(str4.charAt(i));
		}
		sum2=sum4;
	}
	digit=Math.min(sum1,sum2);
	square=(int) Math.pow(digit,2);
	System.out.println(square);
	}
}
}
	
	
	
