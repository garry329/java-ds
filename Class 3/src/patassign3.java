
public class patassign3 {
public static void main(String[] args) {
	int i,j,k,n,a,l;
	n=5;
	for(i=1;i<=n;i++)
	{a=1;
		for(j=1;j<=i;j++)
		{
			System.out.print(a);
			a++;
		}
		for(k=0;k<2*(n-i);k+=1){
			System.out.print(" ");
		}
		for(l=i;l>=1;l--)
		{
			System.out.print(l);
			
		}
		System.out.println();
	}
}
}
