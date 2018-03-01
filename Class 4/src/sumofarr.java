import java.util.Scanner;
import java.lang.*;
public class sumofarr {
	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
int temp,i,j,k,max;
max=arr1.length;
if(arr2.length>max){
	max=arr2.length;}
int[] sum=new int[max+1];
if(arr1.length==arr2.length){
for(k=max,i=max-1,j=arr2.length-1;j>0||i>0||k>0;i--,j--,k--){
		temp=arr1[i]+arr2[j];	
		if(temp>=10)
		{
			sum[k]=sum[k]+temp-10;
			sum[k-1]++;
		}
		else {
			sum[k]=temp+sum[k];
		}
		if(sum[k]>=10){
			sum[k]=sum[k]+temp-10;
			sum[k-1]++;
		}
	}  }
if(arr1.length>arr2.length){
	for(k=max,i=max-1,j=arr2.length-1;j>0||i>0||k>0;i--,j--,k--){
			
		if(j>=0){
			temp=arr1[i]+arr2[j];
		if(temp>=10)
		{
			sum[k]=sum[k]+temp-10;
			sum[k-1]++;
		}
		else {
			sum[k]=temp+sum[k];
		} }
		else{
		sum[k]=arr1[i]+sum[k];	
		}
		
	}	
}
if(arr2.length>arr1.length){
	for(k=max,j=max-1,i=arr1.length-1;j>0||i>0||k>0;i--,j--,k--){
		
		if(i>=0){
			temp=arr1[i]+arr2[j];
		if(temp>=10)
		{
			sum[k]=sum[k]+temp-10;
			sum[k-1]++;
		}
		else {
			sum[k]=temp+sum[k];
		} }
		else{
		sum[k]=arr2[j]+sum[k];	
		}
		
	}
}
return(sum);
}
public static void main(String[] args) {
	int [] o=new int[1000];
	o=sumOfTwoArrays(input(),input());
	print(o);
}
public static void print(int a[]){
	int i;
	for(i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
	
}
public static int[] input(){
	Scanner s=new Scanner(System.in);
	int n =s.nextInt();
	int a[] =new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	return a;
	}

}
