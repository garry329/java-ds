import java.util.Scanner;

public class StringCode {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
String s=sc.next();
codes(s,"");

	}
public static void codes(String s,String o){
	if(s.length()==0)
	{
		System.out.println(o);
		return;
	}
	if(s.length()==1){
		System.out.println(codebreak(s)+o);
		return;
	}
	String str1=codebreak(s.substring(s.length()-1));
	if(!(str1).equals(""))
		codes(s.substring(0, s.length()-1),str1+o);
	
	String str2=codebreak(s.substring(s.length()-2));
	if(!(str2).equals(""))
		codes(s.substring(0, s.length()-2),str2+o);
	
	else return;
	
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

	public static void print(String a[]){
		int i;
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

	}
}
