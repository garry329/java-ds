import java.util.*;

public class armstrong {
	
public static void main(String[] args) {
	int k,c,n,a,s,r;
	
		Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	c=0;
	k=n;
	a=n;
	s=0;
	while(k!=0)
	{c++;
	    k=k/10;
	    
	}
	
	
	while(a!=0)
	{
	    r=a%10;
	    s=s+(int)Math.pow(r,c);
	    a=a/10;
	}
	if(s==n)
		System.out.print("true");
	else{
		System.out.print("false");
	}
}
}
