package assing2;

import java.util.Scanner;

public class bintodec {
public static void main(String[] args) {
	int n;
	int i,s,a;
	a=1;
	s=0;
	System.out.println("enter n");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	while(n!=0)
	{
		i=(n%10)*a;
		s=s+i;
		a=2*a;
		n=n/10;
	}
	System.out.println(s);
}
}
