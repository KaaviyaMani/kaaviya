
import java.io.*;
import java.util.*;;
public class Power {
 	
 	
 	public static void main(String args[])throws IOException{
    Scanner sc = new Scanner(System.in);
    int a,b;
    System.out.println("Enter the number");
    a=sc.nextInt();
    System.out.println("Enter the power number");
    b=sc.nextInt();
    System.out.println(Math.pow(a,b));
  }
}

