package prac;

import java.util.Scanner;
//MOST IMPORTANT ONE IS PAIRSTAR..............................PERIOD MOFO....
public class Recursion2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	System.out.println(pairstar(s));
}
public static String replacepi(String s){
	
	if(s.length()==2){
		if(s.charAt(0)=='p'&&s.charAt(1)=='i'){
			return "3.14";
		}
		else{
			return s;
		}
	}
	if(s.length()==1){
		return s;
	}
	if(s.charAt(0)=='p'&&s.charAt(1)=='i'){
		return "3.14"+replacepi(s.substring(2));
	}else{
		return s.charAt(0)+replacepi(s.substring(1));
	}
}
public static String removex(String s){
	if(s.length()==1&&s.charAt(0)=='x'){
		return "";
	}
	if(s.length()==1){
		return ""+s.charAt(0);
	}
	if(s.charAt(0)=='x'){
		return ""+removex(s.substring(1));
	}
	else{
		return s.charAt(0)+removex(s.substring(1));
	}
}
public static int strToint(String s){
	if(s.length()==1){
		return s.charAt(0)-48;
	}
	int sans=strToint(s.substring(1));
	int ans=(int)(Math.pow(10, s.length()-1))*(s.charAt(0)-48)+sans;
	return ans;
}
public static String pairstar(String s){
	
	if(s.length()==1){
		return s;}
	String s1="";
	  s1 = s1 + s.charAt(0);
      if(s.charAt(0)==s.charAt(1)) s1 = s1 + "*";
      s1 = s1 + pairstar(s.substring(1));
      return s1;
}
}
