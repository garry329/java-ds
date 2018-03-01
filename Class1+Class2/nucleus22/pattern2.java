package nucleus22;

import java.util.Scanner;

public class pattern2 {
public static void main(String[] args) {
	int i,j,k,n,a;
	 Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-i;j++)
		{
			System.out.print(" ");
		}
		a=i;
		for(j=0;j<i;j++)
		{
			System.out.print(a);
			a++;	
		}
		a--;
		for(j=0;j<i-1;j++)
		{    a--;
			System.out.print(a);
			
		}
		System.out.println();
	}
	
}
}
