package assing2;
import java.util.*;
public class Rootsofquad {
public static void main(String[] args) {
	float d1,r1,r2,a,b,c,d;
	
	Scanner sc=new Scanner(System.in);
a=sc.nextFloat();
b=sc.nextFloat();
c=sc.nextFloat();
d=((b*b)-(4*a*c));
d1=(float)Math.sqrt(d);
r1=(-1*b+d1)/(2*a);
r2=(-1*b-d1)/(2*a);
if(d<0)
System.out.println("-1");
else if(d==0)
{	System.out.println("0");
System.out.println(r1+" "+r1);
    
}
else
{	System.out.println("1");
System.out.println(r1+" "+r2);}
}
}
