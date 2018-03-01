import java.util.*;
public class intersecton {
	
	//arr1 and arr2 are the arrays of which you need to print the intersection
	public static void intersection(int[] arr1, int[] arr2){
		//write your code here
		int i,j,n1,n2;
		n1=arr1.length;
		n2=arr2.length;
		int k;
		int a=0;
		int f=1;
		int t[] =new int[n1+n2];
		k=0;
		for(i=0;i<n1;i++){
			f=1;
		    for(j=0;j<n2;j++){
		        if(arr1[i]==arr2[j])
		        {
		        for(a=0;a<k;a++){
		        	if(t[a]==arr1[i])
		        	{
		        		f=0;
		        		break;
			              
		        	}}
		        if(f==1){
		        t[k]=arr1[i];
		        		k++;
		        	}}
		    }         
		    }
		for(i=0;i<k;i++){
			System.out.println(t[i]);
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
				public static void main(String[] args){

		intersection(input(),input());
		}
}
