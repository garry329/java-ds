import java.util.*;

public class Problems {
public static void main(String[] args) {
	print(stockSpan(input()));
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
public static int[] stockSpan(int[] p) {
	// Write your code here
int []b=new int[p.length];Stack<Integer> pr=new Stack<Integer>();
int i=0;

int l= 0;
while(i<p.length){
int c=0;
pr.push(p[i]);
l++;
if(pr.empty()==false&&pr.peek()<=p[i]){
	pr.pop();
	l--;
	c++;
while(pr.empty()==false&&pr.peek()<p[i]){
    c++;
    pr.pop();
    l--;
}}
b[i]=c;

int k=l;
while(k<=i){
    pr.push(p[k]);
    l++;
    k++;
}i++;

}
return b;
}
public static void print(int a[]){
	int i;
	for(i=0;i<a.length;i++){
		System.out.println(a[i]);
	}	
}
public static void countpatt(int arr1[],int arr2[]){
	int n1=arr1.length;
	int n2 =arr2.length;
	int i,j;
	int s1=0;
	int s2=0;
	int e=1;
	for(i=0,j=0;i<n1&&j<n2;){
		if(arr1[i]<arr2[j]){
			s1=s1+s2+e;
			i++;
		}
		else{
			s2=s1+s2+e;
			j++;
			
		}
	}	
		while(i<n1){
		s1=s1+s2+e;
		i++;
	}
	while(j<n2){
		s2=s2+s1+e;
	    j++;
	}
	int s=s1+s2+e;
	System.out.println(s);			
}
public static void printpatt(int a[],int a1,int[]b,int b1){
	if(a1==a.length){
		print(b);
	}
	if(b1==b.length){
		print(a);
	}
	
	
}
}
