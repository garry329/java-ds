package assing2;
import java.text.DecimalFormat;
import java.util.*;
public class sqrtdec {
public static void main(String[] args) {
int b,n,d;
double a;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	d=sc.nextInt();
	a=Math.sqrt(n);
	String pattern = "0.00000";
	DecimalFormat decimalFormat = new DecimalFormat(pattern);

	String format = decimalFormat.format(a);
	System.out.println(format);
	

b=(int)Math.sqrt(n);
if(a-b==0)
{
	d=0;}
if(d==0)
System.out.printf("%.0f",a);
if(d==1)
System.out.printf("%.1f",a);
if(d==2)
System.out.printf("%.2f",a);
if(d==3)
System.out.printf("%.3f",a);
if(d==4)
System.out.printf("%.4f",a);
if(d==5)
System.out.printf("%.5f",a);
if(d==6)
System.out.printf("%.6f",a);
}
}
