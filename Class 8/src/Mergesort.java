import java.util.Scanner;

public class Mergesort {
	public static void merge(int arr1[],int arr2[],int[] m){
		int n1=arr1.length;
		int n2 =arr2.length;
		int i,j,k;
		k=0;
		for(i=0,j=0;i<n1&&j<n2;){
			if(arr1[i]<=arr2[j]){
				m[k]=arr1[i];
				k++;
				i++;
			}
			else if(arr1[i]>arr2[j]){
				m[k]=arr2[j];
				j++;
				k++;
			}
				
			}
		while(i<n1){
			m[k]=arr1[i];
			i++;k++;
		}
		while(j<n2){
			m[k]=arr2[j];
			j++;k++;
		}
		
		
				
	}
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
	public static void print(int a[]){
		int i;
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}
public static int[] mergesort(int a[]){
if(a.length<=1){
	return a;
}
		int b[]=new int[a.length/2];
		int c[]=new int[a.length-b.length];
		for(int i=0;i<b.length;i++){
			b[i]=a[i];
		}
		for(int i=0;i<c.length;i++){
			c[i]=a[i+b.length];
		}		
		mergesort(b);
		mergesort(c);
		merge(b,c,a);
		return a;
	}
public static void main(String[] args) {
	print(mergesort(input()));
}
}
