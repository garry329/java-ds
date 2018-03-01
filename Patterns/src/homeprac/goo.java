package homeprac;

import java.util.Scanner;

public class goo {
public static void main(String[] args) {
	int[] a = new int[29];
	Scanner sc= new Scanner(System.in);
	int s,i,j,n;
	n=sc.nextInt();
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	s=sc.nextInt();
	for(i=0;i<n;i++)
	{
		for(j=1;j<n-i;j++)
		{
			if(a[i]+a[i+j]==s)
			{
				System.out.println("YES");
				return;
			}
		}
	}
	System.out.println("NO");
}
}
