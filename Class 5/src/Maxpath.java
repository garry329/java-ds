import java.util.Scanner;

public class Maxpath {
public static void path(int arr1[],int []arr2){
	int i,j,k,sum;
int n1=arr1.length;
int n2=arr2.length;
int sum1,sum2;
sum1=0;
sum2=0;
sum=0;
int max;
for(i=0,j=0;i<n1&&j<n2;){
	
	if(arr1[i]<arr2[j]){
		sum1=sum1+arr1[i++];
	}
	else if(arr1[i]>arr2[j]){
		sum2=sum2+arr2[j++];
	}
	else{
		if(sum1>=sum2){
			max=sum1;
		}
		else{
			max=sum2;
		}
		sum=sum+max+arr1[i];
sum1=0;
sum2=0;i++;j++;
	}
}
while(i<n1){
	sum1=sum1+arr1[i++];
	
}
while(j<n2){
	sum2 =sum2+arr2[j++];
}
if(sum1>=sum2){
	max=sum1;
}
else{
	max=sum2;
}
sum=sum+max;

System.out.println(sum);
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

	public static void main(String[] args) {
		
path(input(),input());
	}

}
