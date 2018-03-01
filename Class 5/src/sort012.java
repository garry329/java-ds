import java.util.*;
public class sort012 {
	public static void sort012( int[] a){
		int i,j,k;
		i=0;
		j=0;
		k=a.length-1;
		int temp=0;
		for(;j<=k;){
		    if(a[j]==0){
		         temp   =  a[i];
                a[i]  = a[j];
                a[j] = temp;
		        i++;j++;
		        
		    }
		    else if(a[j]==2){
		         temp   =  a[j];
                a[j]  = a[k];
                a[k] = temp;
		        k--;   
		    }
		    else{
		        j++;
		    }
	}
		print(a);}
public static int[] input(){
		Scanner s=new Scanner(System.in);
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
	sort012(input());
}
}
