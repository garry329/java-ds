package nucleus22;

import java.util.*;

public class minmax5 {
	public static void main(String[] args) {
		int a, min, max, i, b, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		n = sc.nextInt();
		System.out.println("enter " + n + " numbers");
		b = sc.nextInt();
		max = min = b;
		for (i = 0; i < n; i++) {
			a = sc.nextInt();
			if (a > max)
				max = a;
			if (a < min) {
				min = a;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}