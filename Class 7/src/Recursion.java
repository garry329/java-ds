import java.util.*;
public class Recursion {
public static int power(int x,int n){
	int ans;
	int sans;
	if(n==0){
		return 1;
	}
	sans=power(x,n-1);
ans=sans*x;
return ans;
}
public static int minarr(int a[]){
	if(a.length == 0){
		return Integer.MAX_VALUE;
	}
	if(a.length==1){
		return a[0];
	}
	int i,ans;
	int b[]=new int [a.length-1];
	for(i=0;i<a.length-1;i++){
		b[i]=a[i];
	}
	int smin=minarr(b);
	if(smin>a[a.length-1]){
		ans=a[a.length-1];
	}
	else{
		ans=smin;
	}
	return ans;
	
}
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	numintowords(n);
	
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
	public static String words(int num){
		if(num==1){
			return("one");
		}
		else if(num==2){
			return("two");
		}
		else if(num==3){
			return("three");
		}
		else if(num==3){
			return("three");
		}
		else if(num==4){
			return("four");
		}
		else if(num==5){
			return("five");
		}
		else if(num==6){
			return("six");
		}
		else if(num==7){
			return("seven");
		}
		else if(num==8){
			return("eight");
		}
		else if(num==9){
			return("nine");
		}
		else{
			return("zero");
		}
		}
	public static void numintowords(int num){
		String ans="";
		if(num/10==0){
			System.out.print(words(num)+" ");
			return;
		}
		numintowords(num/10);
		numintowords(num%10);
	}
public static void seven(int a[]){
	int i;
	if(a.length==0){
			System.out.println("false");
			return;
		}
	int b[]=new int [a.length-1];
	for(i=0;i<a.length-1;i++){
		b[i]=a[i];
	}
	if(a[a.length-1]==7){
	System.out.println("true");
	return;
	}
	seven(b);
}
public static int firstseven(int a[]){
	int i;
	int j=-1;
	if(a.length==1){
		return -1;
	}
int b[]=new int [a.length-1];
for(i=0;i<a.length-1;i++){
	b[i]=a[i];
}
firstseven(b);
if(a[a.length-1]==7){
return ( a.length-1);
}
return -1;
}
}


