
public class Pat4 {
	public static void main(String[] args) {
		int a,i,j,k,n,c;
		a=1;
		c=1;
		n=5;
		if(n%2!=0)
		{
		for(i=0;i<n/2+1;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
			a=c+2*n;
			c=c+2*n;
		}
		c=c-2*n;
		a=c-n;
		for(i=0;i<n/2;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
			a=c-3*n;
			c=c-2*n;
		}}
			
		else
		{
			for(i=0;i<n/2;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(a+" ");
					a++;
				}
				System.out.println();
				a=c+2*n;
				c=c+2*n;
			}
			c=c-2*n;
			a=c-n;
			for(i=0;i<n/2;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(a+" ");
					a++;
				}
				System.out.println();
				a=c-3*n;
				c=c-2*n;
			}
		}
	}
}
