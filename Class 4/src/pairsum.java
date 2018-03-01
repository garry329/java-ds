import java.util.*; 
public class pairsum {
	public static void pairSum(int[] arr, int num){
		//write your code here
		int i,j;
		for(i=0;i<arr.length;i++)
		{
		    for(j=i+1;j<arr.length;j++)
		    {
		        if(arr[i]+arr[j]==num)
		        {
		        	if(arr[i]<=arr[j]){
		            System.out.println(arr[i]+" "+arr[j]);}
		        	else{
		        		System.out.println(arr[j]+" "+arr[i]);
		        	}
		        }
		    }
		}
	}
	public static void main(String[] args){
		int a1[] =new int[1000]; 
		int a2;
		a1=input();
		Scanner sc=new Scanner(System.in);
		a2=sc.nextInt();
		pairSum(a1,a2);
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
