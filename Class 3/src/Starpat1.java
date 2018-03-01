
public class Starpat1 {
public static void main(String[] args) {
	int i,j,k,n;
	n=4;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(i=0;i<n-1;i++)
	{
		for(j=1;j<n-i;j++)
		{
			System.out.print(" ");
		}
		for(k=1;k<n-i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
