import java.util.Scanner;

public class Array {
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
public static void reverseprint(int b[]){
	
	for(int i=b.length-1;i>=0;i--)
	{
		System.out.println(b[i]);
	}
}
public static int sum(int b[]){
	
	int sum=0;
	for(int i=0;i<b.length;i++)
	{
		sum=sum+b[i];
		
	}
	return (sum);
}
public static int[] reversearr(int b[])
{
int i,n;
n=b.length;
for(i=0;i<=(n-1)/2;i++)
{int t= b[n-i-1];
	b[n-i-1]=b[i];
	b[i]=t;
}
return(b);
	}	
public static void print(int a[]){
	int i;
	for(i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
	
}
public static int ls(int a[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter element to be searched");
	int i;
	int s=sc.nextInt();
	for( i=0;i<a.length;i++){
		if(a[i]==s)
		{
			System.out.printf("element found at %d",i);
		}
		
	}
	return (i);
} 
	public static void main(String[] args) {
		int b[]=new int[120]; 
		b=input();
		int a[]=new int[120];
		reverseprint(b);
int sum= sum(b);
System.out.println(sum);
a=reversearr(b);
System.out.println(a);
print(a);
System.out.println(ls(b));
	}
}
