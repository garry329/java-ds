package homeprac;

public class pat4 {
public static void main(String[] args) {
	int i,j,n,a,c;
	n=7;
	for(i=1;i<=n;i++)
	{
		
		for(j=1;j<=i-1;j++)
		{
			System.out.print(" ");	
		}
	a=i;	
		for(j=1;j<=n-i+1;j++)
		{
		System.out.print(a);
		a++;	
		}
		System.out.println();
		}
	
	for(i=1;i<=n-1;i++)
	{
		
		for(j=1;j<=n-i-1;j++)
		{
			System.out.print(" ");	
		}
		a=n-i;
		for(j=1;j<=i+1;j++)
		{
		System.out.print(a);
		a++;	
		}
		System.out.println();
		}	
}
}
