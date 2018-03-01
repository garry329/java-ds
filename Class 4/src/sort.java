import java.util.*;
public class sort {
public static void main(String[] args) {
	int [] a=new int[51];
		int i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<51;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<51;i++){
			System.out.println(a[i]);
		}
}
}
