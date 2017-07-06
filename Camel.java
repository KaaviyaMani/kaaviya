import java.io.*;
public class Camel {
 public static void main(String args[])throws IOException{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int i;
	 char ch;
	 String s;
	String[] str;
	 System.out.println("Enter the string");
	 s=br.readLine();
	 str=s.split(" ");
	 for(i=0;i<str.length;i++)
	 {
		 ch=str[i].charAt(0);
		 ch=Character.toUpperCase(ch);
		 String str1=ch+str[i].substring(1,str[i].length());
		 System.out.print(str1);
		 if(i!=str[i].length())
		 {
			 System.out.print(" ");
		 }
	 }
 }
}
