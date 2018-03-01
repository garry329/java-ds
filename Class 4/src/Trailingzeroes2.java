
public class Trailingzeroes2 {
public static void main(String[] args) {
	int a=0;
	int currentpow=5;
	int n=100;
	while(currentpow<=n)
	{
		a=a+n/currentpow;
		currentpow=currentpow*5;
	}
	System.out.print(a);
}

}
