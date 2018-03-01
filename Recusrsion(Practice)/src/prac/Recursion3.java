package prac;

import java.util.Scanner;

public class Recursion3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	printsubseq(s,"");
}
public static String [] subseq(String s){
	if(s.length()==0){
		String []str=new String[1];
		str[0]="";
		return str;
	}
	String []sans=subseq(s.substring(1));
	String []ans=new String[2*sans.length];
	for(int i=0;i<sans.length;i++){ans[i]=sans[i];}
	for(int i=0;i<sans.length;i++){
		ans[i+sans.length]=s.charAt(0)+sans[i];
	}
	return ans;
}
public static void printsubseq(String s,String outTillNow){
	if(s.length()==0){
		System.out.println(outTillNow);
		return;
	}
	printsubseq(s.substring(1), outTillNow);
	printsubseq(s.substring(1), outTillNow+s.charAt(0));	
}

}
