
public class Sqrtdecwithoutfunc {
public static void main(String[] args) {
	
	int cd=0;
	double i=0;
	double in=1;
	int d=3;
	int n=10;
	while(cd<=d)
	{
		while(i*i<=n){
			i=i+in;
		}
		i=i-in;
		in=in/10;
		cd++;
	}
	System.out.print(i);
}
}
