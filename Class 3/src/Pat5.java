
public class Pat5 {
public static void main(String[] args) {
	int a,i,j,k,n,c;
	n=5;
	for(i=1;i<=n;i++)
	{c=n;
		for(j=1;j<=i;j++)
		{
			a=c-j;
		System.out.print(a+1);	
		}
		
		for(k=1;k<n-i+1;k++)
		{
			a=c-j;
			System.out.print(a+2);
		}
		System.out.println();
	}
}
}
