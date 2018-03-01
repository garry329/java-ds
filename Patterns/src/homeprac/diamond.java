package homeprac;

public class diamond {
public static void main(String[] args) {
	int c,i,j,n,k;
	n=19
			;
	c=1;
	k=n/2;
	for(i=1;i<=n/2+1;i++)
	{	
		for(j=1;j<=k;j++)
		{
			System.out.print(" ");	
		}
	
		for(j=1;j<=c;j++)
		{
		System.out.print("*");
		}
		c=c+2;
		k=k-1;
		System.out.println();
		}	
	c=n-2;
	k=1;
	for(i=1;i<=n/2;i++)
	{	
		for(j=1;j<=k;j++)
		{
			System.out.print(" ");	
		}
		
		for(j=1;j<=c;j++)
		{
		System.out.print("*");	
		}
		k=k+1;
		c=c-2;
		System.out.println();
		}
			
}
}
