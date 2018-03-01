package assing2;
import java.util.*;
public class sqrtdec2 {
	public static void main(String[] args) {
		double b,n;		
		int i,d,j;
		String a1;
		double c;
			Scanner sc=new Scanner(System.in);
			n=sc.nextDouble();
			d=sc.nextInt();
		c=(float)Math.sqrt(n);
		 a1 = ""+c;
		b=(int)Math.sqrt(n);
		if(c-b==0)
		{
		d=0;
		}
		if(d==0)
		System.out.printf("%.0f",c);
		if(d>=1)
		{
			for(i=0;i<a1.length();i++)
			{
				if(a1.charAt(i)!='.')
				{
					System.out.print(a1.charAt(i));
				}}
				
					for(j=0;j<d;j++)
					{
						System.out.print(a1.charAt(i-2+j));
			
					}}
				
			}      
		
		
	
		
	}


