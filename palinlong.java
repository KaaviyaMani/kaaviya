import java.io.*;
import java.util.*;
public class PalinLong{
 	public static void main(String[] args) {
  		Scanner s=new Scanner(System.in);
  		String str=s.next();
  		String s1="";
  		String s2="";
  		int temp=0;
  		String palin="";
  		for(int i=0;i<str.length();i++){
   			for(int j=i+1;j<str.length();j++){
    				if(str.charAt(i)==str.charAt(j)){
   				   s1=(str.substring(i,j+1));	
   				   s2=(new StringBuffer(s1).reverse().toString());
   				   if(s1.equals(s2)){ 
    					   int max=s2.length();
    					   if(max>temp){
     						   temp=max;
     						   palin=s2;
    					   }	
       				 
  				    }
      				
    				}	
   			}
  		}System.out.println(palin);
  	}
  
}
