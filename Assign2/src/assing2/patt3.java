package assing2;

import java.util.Scanner;

public class patt3 {
public static void main(String[] args) {
	int i,j,k,n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	if(n>=1)
	{System.out.print("1");
	System.out.println();}
	if(n>=2)
		System.out.println("11");
	if(n>2)
	{
for(i=1;i<=n-2;i++)
{System.out.print(i+1);
	for(j=1;j<=i;j++)
{
	System.out.print("2");}
	System.out.print(i+1);
System.out.println();
	}
}
}
}
