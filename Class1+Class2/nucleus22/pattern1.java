package nucleus22;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		int i, j, n, v;
		v = 1;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(v + " ");
				v++;
			}
			System.out.println();
		}
	}
}
