package nucleus22;

import java.util.Scanner;

public class fibo {
public static void main(String[] args) {
  int i,n,p,c,a;
  p=0;
  n=0;
  c=1;
  Scanner sc= new Scanner(System.in);
	a=sc.nextInt();
for(i=0;i<a;i++)
{
	n=p+c;
	p=c;
	c=n;
}
System.out.println(p);
}
}
