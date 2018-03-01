import java.util.*;

public class Mergetwoarrays {
	public static void merge(int arr1[],int arr2[]){
		int n1=arr1.length;
		int n2 =arr2.length;
		int [] m=new int[n1+n2];
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
		print(m);
		
				
	}
	public static int maximumProfit(int budget[]) {
		Arrays.sort(budget);
		
		int sum=0,l=budget.length;
		int max=0;
		
		for(int j=0;j<budget.length;j++)
	    {
	        sum=budget[j]*l;
	        if(sum>max){
	            max=sum;
	        }
	        sum=0;
	        l--;
	    }
		return max;

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
public static void main(String[] args) {

	System.out.println(	maximumProfit(input()));
}
}
