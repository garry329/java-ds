import java.util.*;
public class pairsab {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		 int n=sc.nextInt();
		 int i,j;
		 for(i=0;i<n/2;i++)
		 {for(j=0;j<=n/2;j++)
		     {
		         if((Math.pow(i,2)+Math.pow(j,2)) == n && i<=j)
		         {
		             System.out.println(i+" "+j);
		         }
		     }
		 }
	}

}
