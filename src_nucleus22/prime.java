package nucleus22;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		int n, i;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("not prime");
				return;
			}
		}
		System.out.println("prime");
	}
}
