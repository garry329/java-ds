package assing2;

import java.util.Scanner;

public class seq {
public static void main(String[] args) {
	int i,n,j;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
    int b[] = new int[40];
    for(i=0;i<n;i++)
    {
    	b[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
    	for(j=1;j<n;j++)
    	{
    		if(b[i]==b[i+j])
    		{
    			System.out.print("false");
    			return;
    		}
    	}
    }
    System.out.print("true");
   

}
}
