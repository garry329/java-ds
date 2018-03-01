import java.util.*;
public class twodarr {

	public static void main(String[] args) {
		int a[][]=multiinput();
		wave(a);
	}
	public static int[][] multiinput(){
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=s.nextInt();
			}
		}
		return a;
	}
	public static void wave(int a[][]){
		int n = a[0].length;
		for(int i=0;i<n;i++){
			if(i%2==0){
				for(int j=0;j<a.length;j++){

					System.out.print(a[j][i]+" ");
				}}
			else{
				for(int j=a.length-1;j>=0;j--){

					System.out.print(a[j][i]+" ");
				}	
			}
		 }
	}

	public static void print2d(int a[][]){


	}}
