package Stringsass;

import java.util.Scanner;

public class removeDuplicate {
	public static String dup(String s) {
	    // Write your code here
int c,i,j;
c=0;i=0;
String s2="";
while(i<s.length()){
    c=0;
    for(j=i+1;j<s.length();j++){
        if(s.charAt(i)==s.charAt(j)){
            c++;
        }
        else{
        	break;
        }

    }
    s2=s2+s.charAt(i);    
 i=i+c+1;
}
	return s2;}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s =sc.nextLine();
		String s2=dup(s);
		System.out.println(s2);

	}

}
