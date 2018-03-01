package assing2;
import java.util.*;
public class salary {
	public static void main(String[] args) {
		// Write your code here
		double b,d,h,t,p,a;
		Scanner sc=new Scanner(System.in);
	b=sc.nextDouble();
	char c=sc.next().charAt(0);
	h=0.2*b;
	d=0.5*b;
	p= 0.11*b;
	if(c=='A')
	{a=1700;}
	else if(c=='B')
	{a=1500;}
	else
	{a=1300;}
	
  t = b + h + d + a;
  t=t-p;
  
  System.out.printf("%.0f",t);

  
	}
}
