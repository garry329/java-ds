import java.util.*;
public class geosum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	System.out.println(findGeometricSum(k));
	}
public static double findGeometricSum(int k){
	// Write your code here
double	n=1/Math.pow(2,k);
if(n==1){
return 1;
}
double sans,ans;
sans=0;
ans=0;
sans=findGeometricSum(k-1);
ans=n+sans;
    return ans;
}
}
