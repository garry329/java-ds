package homeprac;

public class pat3 {
public static void main(String[] args) {
	int i,j,n,a,c;
	n=9;
	
	for(i=1;i<=n;i++)
	{
		System.out.print("1");
		a=2;
		for(j=1;j<=i-1;j++)
		{
			System.out.print(a);
			a++;
		}
		a=a-2;
		for(j=1;j<=i-2;j++)
		{
			System.out.print(a);
			a--;
		}
		if(i>1)
		{
		System.out.print("1");}
		System.out.println();
		}
}
}
