import java.util.*;
public class sumofdigits {

	public static int sumOfDigits(int n){
int sans,ans;
ans=0;
sans=0;
		// Write your code here
if(n/10==0){
    sans=sans+n;
    return sans;
}

sans=sumOfDigits(n/10);
ans=sans+sumOfDigits(n%10);
	return ans;}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(sumOfDigits(n));
	}

}
