import java.util.*;

public class ReverseString {
public static String rev(String s){
	String r="";
	int i,j;
	for(i=s.length()-1;i>=0;i--){
		r=r+s.substring(i,i+1);
	}
	return(r);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s =sc.nextLine();

	len(s);
}
public static void rev2(String s){
	

	int k=0;
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)==' '|| i==s.length()-1){
					String r=rev(s.substring(k,i+1));
					k=i+1;
					System.out.print(r+" ");
		}
		
	}
	
}
public static void len(String s){
	int k=0;
	int min=666666;
	int m=0;
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)==' '|| i==s.length()-1){
					if(s.substring(k,i).length()<min){
					min=s.substring(k,i).length();
					m=k;
					}k=i; }
		
	}
	System.out.println(s.substring(m, m+min).replaceAll(" ", ""));
}
public static void rev3(String s){
	
}
public static void print(int a[]){
	int i;
	for(i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
	
}
public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
public static void Mostc(String s){
	int i,j;
	char ch;
	int []c=new int[26];
	for(i=0;i<s.length();i++){
		 ch=s.charAt(i);
		j=ch-97;
		c[j]++;
	}
int max = getMax(c);
for(int k = 0;k<s.length();++k)
{	int index = s.charAt(k)-97;
	if(c[index]==max)
		{System.out.println(s.charAt(k));
		break;}
	}
	
}

}

