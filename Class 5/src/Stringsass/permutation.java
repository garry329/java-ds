package Stringsass;

import java.util.Scanner;

public class permutation {
	public static void permu(String s1,String s2){
	    int i,j,flag;
	    flag=0;
	    boolean b=false;
for(i=0;i<s1.length();i++){
    for(j=0;j<s2.length();j++){
        if(s2.charAt(j)==s1.charAt(i))
        {
        	flag++;
            break;
        }
    }
}
if(flag==s1.length()){
	b=true;
}

	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s =sc.nextLine();
}
}
