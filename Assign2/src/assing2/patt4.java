package assing2;

import java.util.Scanner;

public class patt4 {
public static void main(String[] args) {
	int i,j,k,n,a;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
for(i=1;i<=n;i++)
{a=1;
	for(j=1;j<=n-i+1;j++)
{
	System.out.print(a);
	a++;}
System.out.println();
	}
}
}
