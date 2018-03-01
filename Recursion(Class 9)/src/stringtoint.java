import java.util.Scanner;

public class stringtoint {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	System.out.println(convertStringToInt(s));

}
public static int convertStringToInt(String s){
	if(s.length()==1){
	 int d=(int)s.charAt(0)-48;
	 return d;
	}
	int ans=((int)s.charAt(s.length()-1)-48)+10*convertStringToInt(s.substring(0, s.length()-1));
	return ans;
	}
}
