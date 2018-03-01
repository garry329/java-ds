import java.util.Scanner;

public class Selectionsort {
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
public static int min(int b[],int s){
	int min=Integer.MAX_VALUE;
	int n=b.length;
	int i;
	for( i=s;i<n;i++){ 
		if(b[i]<min){
			min=b[i];}
	}
	return(i);
}	
public static void selsort(int b[]){
	int n=b.length;
	int i,j;
	for(i=0;i<n-1;i++){
		int m=b[min(b,i)];
		for(j=i;j<n-1;j++) {
			int t=b[i];
			b[i]=m;
			b[min(b,i)]=t;
			}
	}
	
}
public static void print(int a[]){
	int i;
	for(i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
	
}
public static void main(String[] args) {
	int a[] =new int[100];
	a=input();
	selsort(a);
print(a);	
}
}
