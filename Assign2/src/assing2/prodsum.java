package assing2;
import java.util.Scanner;
public class prodsum {
	public static void main(String[] args) {
		int c,n,p,s,i;
		p=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=sc.nextInt();
		switch(c)
		{
		  case 1:
		        s=n*(n+1)/2;
		                    System.out.println(s);
		                    break;
		                    case 2:
		                        for(i=1;i<=n;i++)
	                              {
	                                  p=i*p;
	                              }
	                              		                    System.out.println(p);
	                              		                    break;
	                              		                    default:
	                              		                    System.out.println("-1");
	                          


		    
		    
		}
	}

}
