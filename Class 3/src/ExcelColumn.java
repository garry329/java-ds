import java.util.Scanner;

public class ExcelColumn {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String k=sc.next();
	int i,j,s,d,m;
	s=0;
	for(i=0;i<k.length();i++)
	{
		j=k.charAt(i);
		d=90-j+1;
		
		m=Math.abs(i*27-d);
		s=s+m;
	}
	
	System.out.print(s);
}
}
