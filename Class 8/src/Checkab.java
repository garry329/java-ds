import java.util.Scanner;

public class Checkab {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
	System.out.println(checkStringWithAandB(s));

	}
	public static boolean checkStringWithAandB(String s){
		if(s.length()==0){
			return true;
		}
		if(s.length()==1&&s.charAt(0)=='a'){
			return true;
		}
		if(s.length()==2&&s.charAt(0)=='b'&&s.charAt(1)=='b'){
			return true;
		}
		if(s.charAt(0)=='a'){
			if(s.charAt(1)=='a'){
				return checkStringWithAandB(s.substring(2));
			}
			if(s.charAt(1)=='b'&&s.charAt(2)=='b'){
				return checkStringWithAandB(s.substring(3));
			}
		}
		else if(s.charAt(0)=='b'&&s.charAt(1)=='b'){
			if(s.charAt(2)=='a'){
				return checkStringWithAandB(s.substring(3));
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	return false;}
}
