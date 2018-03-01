package assing2;
import java.util.*;
public class seq2 {
	public static void main(String[] args) {
		// Write your code here
		int i,n,j,c,d;
		c=0;
		d=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	    int b[] = new int[3000];
	    for(i=0;i<n;i++)
	    {
	    	b[i]=sc.nextInt();
	    }
	    for(i=0;i<n;i++)
	    {
	    	for(j=1;j<n;j++)
	    	 {
	    	 
	    	   	if(b[i]==b[i+j])
	    		{
	    			System.out.print("false");
	    			return;
	    		}
	    	   	else if(b[i]>b[i+j]||b[i]<b[i+j])
	    	   	{
	    		    System.out.print("true1");
return;
	    	   	}
	    	}
	    }
	    for(i=0;i<n;i++)
	    {
	          if(b[i]>b[i+1])
	    	   {
	    	       c=0;
	    	   }
	    	   
	          else if(b[i]<b[i+1])
	    	   {
	    	       d=0;
	    	   }
	          if (d==0)
	          {
	        	  if(b[i]>b[i+1])
	        	  {
	        		  System.out.print("false");
		    			return; 
	        	  }
	          }
	    	     
	    	   }
	    
	    
	    System.out.print("true");

		}
}
