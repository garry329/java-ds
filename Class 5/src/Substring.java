import java.util.*;
public class Substring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s =sc.next();
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<s.length()-1;i++){
			for(j=0;j<s.length();j++){
				if(s.substring(i,j+2).length()==n){
				System.out.print(s.substring(i,j+2)+" ");
			}}
		}
	}
}
