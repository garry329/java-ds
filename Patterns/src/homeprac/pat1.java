package homeprac;

public class pat1 {
public static void main(String[] args) {
	int i,j,n,a,c;
	n=7;
	
	for(i=1;i<=n;i++)
	{
	 a=1;
		for(j=1;j<=i;j++)
		{
			System.out.print(a);
		a++;	
		}
		System.out.println();
	}
	for(i=1;i<=n-1;i++)
	{
	 a=1;
		for(j=1;j<=n-i;j++)
		{
			System.out.print(a);
		a++;	
		}
		System.out.println();
	}
}
}
