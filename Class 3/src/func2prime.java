import java.util.Scanner;

public class func2prime {
public static void prime(int k){
	int i,n;
	n=k;
	for (i = 2; i < n; i++) {
		if (n % i == 0) {
			System.out.println("not prime");
			return;
		}
	}
	System.out.println("prime");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		prime(n);
	}

}
