import java.util.*;
public class Countcharlinewords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
sc.useDelimiter("\\$");
String s =sc.next();
int c=0;
int w=0;
int l=1;
int i;
i=0;
while(i<s.length()){	
if(s.charAt(i)!=' '&&s.charAt(i)!='\n'){
	c++;
}
if(s.charAt(i)==' '||s.charAt(i)=='\n'){
	w++;
}

if(s.charAt(i)=='\n'){
	l++;
	c--;
}
i++;
}
System.out.println(c);
System.out.println(w);
System.out.println(l);
}
}
