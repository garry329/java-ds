import java.util.Scanner;

public class pairstar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	System.out.println(replace(s));
}
public static String pstar(String s){

	if(s.length()==1){
		return "";}
	String s1=pstar(s.substring(1));
	String s2="";
	s1=s1+s.charAt(0);
	if(s.charAt(0)==s.charAt(1) ){
		s1=s1+"*";
	}
return s1;
}
public static String removeX(String s){
	String s1="";  
	if(s.length()==1){
	      if(s.charAt(0)=='x'){
	          return "";
	      }
	      else{return Character.toString(s.charAt(0));}
	  }
	  if(s.charAt(0)=='x'){
	      s1=s1+"";
	  }
	  else{
		  s1=s1+s.charAt(0);
	  }
	  s1=s1+removeX(s.substring(1));
	return s1;
}
public static String replace(String s){
	String s1="";  
	if(s.length()==1){
		return Character.toString(s.charAt(0));
	}
	
	if(s.length()==2&&(s.charAt(0)=='p'&&s.charAt(1)=='i')){
		return "3.14";
	}
	  
	  if(s.charAt(0)=='p'&&s.charAt(1)=='i'){
	      s1=s1+"3.14";
	      s1=s1+replace(s.substring(2));
	  }
	  else{
		  s1=""+s1+s.charAt(0);
		  s1=s1+replace(s.substring(1));
	  }
	  
	return s1;
}
public static String fstar(String s){
	int i;
	String s1="";
	String s2="";
	for(i=0;i<s.length()-1;i++){
		s1=s1+s.charAt(i);
		if(s.charAt(i)==s.charAt(i+1)){
			s1=s1+"*";
		}
	}

return s1+s.charAt(s.length()-1);}
}
