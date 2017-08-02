import java.io.*;
import java.util.*;
public class Descenorder
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of array");
	double size=s.nextDouble();
	   
		   double iAr[] =new double[(int) size];
		   System.out.println("enter the element");
		   for(int i=0;i<iAr.length;i++){
			   iAr[i]=s.nextInt();
		   }


	   
	   Arrays.sort(iAr);

	   for(int j=iAr.length-1;j>=0;j--){
		   System.out.print(iAr[j]+" ");
	   }
	   }

	}
