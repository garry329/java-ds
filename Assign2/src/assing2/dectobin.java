package assing2;

import java.util.Scanner;

public class dectobin {
public static void main(String[] args) {
	int n,i;
	i=0;
	long s;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
    int b[] = new int[40];
while(n!=0)
{b[i]=n%2;
n=n/2;
i++;
	}
for(int a = i-1;a >= 0;a--){
    System.out.print(b[a]);
  }
	
}
}
