package prac;

import java.util.Scanner;

public class Recursion4 {
	public static void printpermu(String s,String outTillNow){
		if(s.length()==0){
			System.out.println(outTillNow);
			return;
		}
		else{
			for(int i=0;i<s.length();i++){
				printpermu(s.substring(0,i)+s.substring(i+1,s.length()),outTillNow+s.charAt(i));

			}}
	}
	public static void printinter(String s1, String s2, String outTillNow){
		  if(s1 == null){
		   System.out.println(s2);
		   return;
		                }
		  if(s2 == null){
		   System.out.println(s1);
		   return;
		 }
		  if(s1.length()==0 && s2.length()==0){
		   System.out.println(outTillNow);
		}
		  if(s2.length() != 0){
	  		   printinter(s1, s2.substring(1), outTillNow + s2.charAt(0) );
	  }
		  if(s1.length() != 0){
		  		   printinter(s1.substring(1), s2, outTillNow + s1.charAt(0));
		     }
		             }
	public static void main(String[] args) {
		 printinter("abc", "def", "");
	}
	public static String[] codes(String s){
		if(s.length()==0)
		{
			String[] str=new String[1];
			str[0]="";
			return str;
		}
		if(s.length()==1){
			String[] str=new String[1];
			str[0]=codebreak(s);
			return str;
		}
		String []sans=codes(s.substring(0, s.length()-1));
		String s1=codebreak(s.substring(s.length()-1));
		String []sans1=new String[0];
		String s2=codebreak(s.substring(s.length()-2));
		if(!(s2).equals("")){
			sans1=codes(s.substring(0, s.length()-2 ) );	
		}
		String ans[]=new String[sans.length+sans1.length];
		for(int i=0;i<sans.length;i++){

			ans[i]=sans[i]+s1;
		}

		for(int i=0;i<sans1.length;i++){
			ans[i+sans.length]=sans1[i]+s2;
		}		
		return ans;

	}
	public static void print(String a[]){
		
		int i;
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}
	public static String codebreak(String c){
		String ans="";
		if(c.equals("1")){ans="a";}else if(c.equals("2")){ans="b";}else if(c.equals("3")){ans="c";}
		else if(c.equals("4")){ans="d";}else if(c.equals("5")){ans="e";}else if(c.equals("6")){ans="f";}
		else if(c.equals("7")){ans="g";}else if(c.equals("8")){ans="h";}else if(c.equals("9")){ans="i";}
		else if(c.equals("10")){ans="j";}else if(c.equals("11")){ans="k";}else if(c.equals("12")){ans="l";}
		else if(c.equals("13")){ans="m";}else if(c.equals("14")){ans="n";}else if(c.equals("15")){ans="o";}
		else if(c.equals("16")){ans="p";}else if(c.equals("17")){ans="q";}else if(c.equals("18")){ans="r";}
		else if(c.equals("19")){ans="s";}else if(c.equals("20")){ans="t";}else if(c.equals("21")){ans="u";}
		else if(c.equals("22")){ans="v";}else if(c.equals("23")){ans="w";}else if(c.equals("24")){ans="x";}
		else if(c.equals("25")){ans="y";}else if(c.equals("26")){ans="z";}
		return ans;}
	public static int fact(int n)
	{
		int output;
		if(n==1){
			return 1;
		}
		output = fact(n-1)* n;
		return output;
	}
	public static String reverse(String s){
		if(s.length()==1){return s;}
		String sans=reverse(s.substring(1));
		String ans=sans+s.charAt(0);
		return ans;}
public static String[] permu(String s){
	if(s.length()==1){
		String[] str=new String[1];
		str[0]=s.charAt(0)+"";
				return str;
	}
	String []sans=permu(s.substring(1));
	String []ans=new String[fact(s.length())];

	int count=0;
	for(int i=0;i<sans.length;i++,count++)
	{
		ans[count] = s.charAt(0)+sans[i];
	}
	for(int i=0;i<sans.length;i++,count++)
	{
		ans[count] = sans[i]+s.charAt(0);
	}
	for(int i=0;i<sans.length;i++)
	{
		for(int j=1;j<sans[i].length();++j)
		{
			ans[count++] = sans[i].substring(0, j)+s.charAt(0)+sans[i].substring(j);
		}
	}
return ans;
}
}
