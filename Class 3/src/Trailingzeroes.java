import java.util.Scanner;

public class Trailingzeroes {
	public static void countTrailingZerosInFact(long num){
    	long n,i,a;
    	n=num;
    	long c;

c=0;

for(i=n;i>=1;i--)
{
    if(i%5==0)
	{a=i;
	while(a%5==0)
	{
		c++;
		a=a/5;
	}}
}
System.out.print(c);
}
public static void main(String[] args){
   	Scanner sc= new Scanner(System.in);
 long num=sc.nextLong();
 
}
}
