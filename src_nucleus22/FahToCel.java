package nucleus22;
import java.util.Scanner;


public class FahToCel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		char first = s.charAt(0);
		
		System.out.println(s);
		s = scan.nextLine();
		System.out.println(s);
		
		int min = 0;
		int max = 300;
		int increment = 20;
		
		System.out.println("Please enter input");
		min = scan.nextInt();
		max = scan.nextInt();
		increment = scan.nextInt();
		
		double d = scan.nextDouble();
	
		
		// be very careful with this. Don't close if further input is to be taken
		scan.close();
		
		
		
		int f = min;
		//double c = (5.0/9)*(f - 32);
		//int c = (5 * (f - 32))/9;
		while (f <= max) {
			int c = (int)((5.0/9)*(f - 32));
			System.out.print(f);
			System.out.print("\t");
			System.out.println(c);
			f = f + increment;
		}
	}

}
