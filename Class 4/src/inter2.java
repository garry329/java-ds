import java.util.*;

public class inter2 {
	public static void intersection(int[] arr1, int[] arr2){
		int i,j,n1,n2;
		n1=arr1.length;
		n2=arr2.length;
		int k;
		int a;
		int n1c,n2c;
		int in;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(i=0;i<n1;){
		n1c=0;
		n2c=0;
			in=Arrays.binarySearch(arr2, arr1[i]);
		        if(in>=0&&in<=(n2-1))
		        {
		            for(a=0;a<n1;a++)
		            {
		                if(arr1[a]==arr1[i])
		                {
		                    n1c++;
		                    
		                }
		            }
		            for(a=0;a<n2;a++){
		                if(arr2[a]==arr1[i])
		                {
		                    n2c++;
		                }
		            }
		            if(n1c==n2c){
		                for(a=0;a<n1c;a++){
		                    System.out.println(arr1[i]);
		                }
		            }
		            else if(n1c>n2c){
		                for(a=0;a<n2c;a++){
		                    System.out.println(arr1[i]);
		                }
		            }
		            else{
		                for(a=0;a<n1c;a++){
		                    System.out.println(arr1[i]);
		                }
		            }
		            i=i+n1c;
		        	}
		        else{
		        	i++;
		        }
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
