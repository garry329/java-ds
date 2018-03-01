import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class func1 {
	public static void fibo(int k){
		 int i,n,p,c;
		 
		  p=0;
		  n=0;
		  c=1;
		for(i=1;i<k;i++)
		{
			n=p+c;
			p=c;
			c=n;
		}
		System.out.println(p);
	}
public static void main(String[] args) {
	int k;
	Scanner sc= new Scanner(System.in);
	k=sc.nextInt();
	fibo(k);
}
}
