import java.util.*;


public class zeroreplace {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	 int n=sc.nextInt();
	 int i;
	 char[] c = (""+n).toCharArray();
	for(i=0;i<c.length;i++)
	{
		if(c[i]=='0')
		{
			c[i]='5';
		}
	}
		 
				 
	 
	 System.out.print(c);
}
}
