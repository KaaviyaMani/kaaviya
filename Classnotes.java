import java.io.*;
public class Classnotes {
	public static void main(String args[])throws IOException
	{
		String friends,status,idNum;
		int n,k,i,flag=0;
		
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the number of alex friends and total number of friends");
   friends=br.readLine();
   String[]s=friends.split(" ");
   n=Integer.parseInt(s[0]);
   k=Integer.parseInt(s[1]);
   int[]id=new int[k];
   int[]note=new int[n];
   
   System.out.println("Enter the status of friends");
   status=br.readLine();
   char[]c=status.toCharArray();
   for(i=0;i<n;i++)
   {
	  note[i]=Character.getNumericValue(c[i]);
	  
	 
   }
   System.out.println("Enter id number of alex friends");
   idNum=br.readLine();
   String[]s1=idNum.split(" ");
  
   for(i=0;i<k;i++)
   {
	  id[i]=Integer.parseInt((s1[i]));
	  
	 
   }
     for(i=0;i<k;i++)
     {
    	 if(note[id[i]-1]==1)
    	 {
    		 System.out.println("yes");
    		 flag=1;
    		 break;
    	 }
     }
    	if(flag==0)
    	 {
    		 System.out.println("no");
    	
    	 }
     
  
	}
}
