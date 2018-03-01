package prac;

import java.util.Scanner;

public class Recursion1 {
public static int sumofdigits(int num){
	if(num/10==0){
		return num;
	}
	int smallsum=sumofdigits(num/10);
	int sum=smallsum+num%10;
	return sum;
}
public static Boolean palindrome(String s){
	if(s.length()==1){
		return true;
	}
	if(s.length()==2){
		if(s.charAt(0)==s.charAt(1)){
			return true;
		}
		else{
			return false;
		}}
	if(s.charAt(0)==s.charAt(s.length()-1)){
		Boolean ans=palindrome(s.substring(1,s.length()-1));
		return ans;
	}
return false;}
public static double geosum(int k){
	if(k==1){
		return 1.5;
	}
	double sans=geosum(k-1);
	double ans=sans+(1/Math.pow(2,k));
	return ans;
}
public static int countzeros(int num){
	if(num==0){
		return 1;
	}
	if(num/10==0){
		return 0;
	}
	int sans=countzeros(num/10);
	if(num%10==0){
		return sans+1;
	}
	else{
		return sans;
	}
}
public static int multiply(int a,int b){
	if(a==1){
		return b;
	}
	if(b==1){
		return a;
	}
	if(a>=b){
		return b+multiply(a-1,b);
	}
	else{
		return a+multiply(a, b-1);
	}
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int num2=sc.nextInt();
	System.out.println(multiply(num,num2));
//	String s=sc.next();
//	System.out.println(palindrome(s));
}
}
