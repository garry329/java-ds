import java.util.*;
public class test {
public static void main(String[] args) {
	int i,j,n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=0;i<=n;i++)
	{
		 for(j=0;j<n-i;j++)
		    {
		        System.out.print(" ");
		    }
	    for(j=i;j>=1;j--)
	    {
	        System.out.print(j);
	    }
	    for(j=2;j<=i;j++)
	    {
	        System.out.print(j);
	    }
	    System.out.println();
	}
}
}
