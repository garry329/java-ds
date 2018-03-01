import  java.util.*;
public class palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	System.out.println(isStringPalindrome(s));
}

public static boolean isStringPalindrome(String s) {
boolean a=false;
if(s.length()==0){
	a=true;
	return a;
}
if(s.charAt(0)!=s.charAt(s.length()-1)){
a=false;
return a;
	}
String s1=""+s.charAt(0)+s.charAt(s.length()-1);
isStringPalindrome(s1);


return a;
}
}
