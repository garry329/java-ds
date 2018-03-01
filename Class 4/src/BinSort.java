import java.util.Scanner;

public class BinSort {
	public static int[] input(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter n");
		int n =s.nextInt();
		int a[] =new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		return a;
		}
public static void main(String[] args) {
	int a[] =new int[123];
	a=input();
	int i,f,l,m,s;
	f=a[0];
	l=a[a.length-1];
	m=(f+l)/2;
	Scanner sc=new Scanner(System.in);
	s=sc.nextInt();
	int flag=0;
	while(f<l){
		
		m=(f+l)/2;
		if(s==a[m]){
			flag=1;
			break;
		}
		else if(s<a[m]){
			l=m-1;
		}
		else
			{f=m+1;}
	}
		if(flag==1){
			System.out.println("found at "+m);
		}
		else{
			System.out.println("not found");
		}
		
		
	}
	
}

