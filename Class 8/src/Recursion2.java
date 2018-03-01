import java.util.Scanner;

public class Recursion2 {
	public static boolean isSorted(int a[],int sI){
		if(sI==a.length-1||sI==a.length){
			return true;
		}
		if(a[sI]>a[sI+1]){
			return false;
		}
		
			return isSorted(a,sI+1);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		print(subseq(s));
}
	public static String getString(char c){
		String ans="";
		if(c=='2'){
			 ans="abc";
		}
		if(c=='3'){
			ans= "def";
		}
		if(c=='4'){
			ans="ghi";
		}
		if(c=='5'){
			ans= "jkl";
		}
		if(c=='6'){
			ans= "mno";
		}
		if(c=='7'){
			ans= "pqrs";
		}
		if(c=='8'){
			ans= "tuv";
		}
		if(c=='9'){
			ans= "wxyz";
		}
		return ans;
	}
	public static String[] keypad(String s){
		if(s.length()==0){
			String []str=new String[1];
			str[0]="";
			return str;
		}
		String []sans=keypad(s.substring(1));
		String []ans=new String[sans.length*getString(s.charAt(0)).length()];
		int k=0;
		for(int i=0;i<getString(s.charAt(0)).length();i++){
			for(int j=0;j<sans.length;j++){
				ans[k++]=getString(s.charAt(0)).charAt(i)+sans[j];
			}
		}
		return ans;
	}
	public static int first(int n){
		int first=0;
		if(n/10==0){}
		  while(n>=10){
			  n=n/10;
		  }
return first;
	}
	public static String[] keypad(int n){
		if(n==0){
			String []str=new String[1];
			str[0]="";
			return str;
		}
		String []sans=keypad(n-(first(n)*10));
		String []ans=new String[sans.length*getString((first(n)+"").charAt(0)).length()];
		int k=0;
		for(int i=0;i<getString((first(n)+"").charAt(0)).length();i++){
			for(int j=0;j<sans.length;j++){
				ans[k++]=getString((first(n)+"").charAt(0)).charAt(i)+sans[j];
			}
		}
		return ans;
	}

	public static String[] subseq(String s){
	if(s.length()==0){
		String []str=new String[1];
		str[0]="";
		return str;
	}
	String []sans=subseq(s.substring(1));
	String []ans=new String[sans.length*2];
	for(int i=0;i<sans.length;i++){
		ans[i]=sans[i];
	}for(int i=0;i<sans.length;i++){
		ans[i+sans.length]=s.charAt(0)+sans[i];
	}
	return ans;
	}
	
	public static void print(String a[]){
		int i;
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

	}
}
