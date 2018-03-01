
public class Alphapattern {
public static void main(String[] args) {
	int i,j,k,n;
	n=7;
	char c;
	
	for(i=0;i<n;i++)
	{c='a';
		for(j=0;j<n-i;j++)
		{
			System.out.print(c);
			c++;
		}
	c--;
	System.out.print(" ");
		for(j=0;j<n-i;j++)
		{
			System.out.print(c);
			c--;	
		}
		System.out.println();
	}
}
}
