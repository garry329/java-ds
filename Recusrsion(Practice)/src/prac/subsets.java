package prac;

import java.util.*;

public class subsets {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
	printSubsetsSumTok(input(),k);
//print(subsets(input()));
	}
	public static int[] input(){
		Scanner s=new Scanner(System.in);
		
		int n =s.nextInt();
		int a[] =new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		return a;
	}
	public static void printSubsetsSumTok(int input[], int inputSum) {
		// Write your code here
	print(sumk(input,inputSum));	
	}
	public static int[][] subsets(int input[]) {
		// Write your code here
	 if(input.length==0)
	 {
	     int str[][] = new int [1][0];
	     return str;
	 }
	 if(input.length==1)
        {
            int str[][] = new int[2][];
            str[0] = new int[0];
            str[1] = input;
            return str;
        }
        int newInput[] = new int[input.length-1];
        for(int i=0;i<input.length-1;++i)
        newInput[i] = input[i];
        int smallAns [][] = subsets(newInput);
        int ans [][] = new int[smallAns.length*2][];
        
            for(int i=0;i<smallAns.length;++i)  //This for loop copies the small Answer
            {   ans[i] = new int [smallAns[i].length];
                for(int j=0;j<smallAns[i].length;++j)
                ans[i][j] = smallAns[i][j];
            }
            
            int j;
            for(int i=0;i<smallAns.length;++i)
            {   ans[i+smallAns.length] = new int[smallAns[i].length+1];
                for(j=0;j<smallAns[i].length;++j)
                ans[i+smallAns.length][j] = smallAns[i][j];
                ans[i+smallAns.length][j] = input[input.length-1];
            }
            
            return ans;
	}
	public static int[][] sumk(int input[],int inputSum){
	    int [][]temp = subsets(input);
	    int count = 0;
	    for(int k=0;k<temp.length;++k)
	    {int sum = 0;
	        for(int l = 0;l<temp[k].length;++l)
	        {
	        sum += temp[k][l];
	        }
	        if(sum==inputSum)count++;
	    }
	    int [][] ans = new int[count][];
	    int i = 0;
	    for(int k=0;k<temp.length;++k)
	    {int sum = 0;
	        for(int l = 0;l<temp[k].length;++l)
	        {
	        sum += temp[k][l];
	        }
	        if(sum==inputSum){ans[i] = new int[temp[k].length];
	        	              ans[i] =  temp[k];
	                          i++;
	            }
	        }
	    return ans;
    }
//	public static int[][] subsets(int input[]) {
//		// Write your code here
//		if(input.length==0)
//		{
//			int [][]str= new int[1][1];
//			str[0][0]=new int[1][0];
//			return str;
//		}
//		if(input.length==1){
//			int [][]str=new int[2][];
//			str[0]=new int[0];
//		return str;	
//					}
//		int []a=new int[input.length-1];
//		for(int i=0;i<input.length-1;i++)
//		{
//			a[i]=input[i];	
//		}
//		int [][]sans=subsets(a);
//		int [][]ans=new int[sans.length*2][];
//		for(int i=0;i<sans.length;i++){
//			//ans[i]=new int[sans[i].length];
//			for(int j=0;j<sans[i].length;j++){
//				ans[i][j]=sans[i][j];
//			}
//		}
//		int j;
//		for(int i=0;i<sans.length;i++){
//	ans[i]=new int [sans[i].length];
//			for( j=0;j<sans[i].length;j++){
//				ans[i+sans.length][j]=sans[i][j];
//			}
//			ans[i]=new int [sans[i].length+1];
//			ans[i+sans.length][j]=input[input.length-1];
//		}
//		return ans;
//	}
//	public static int[][] subsets(int input[]) {
//		// Write your code here
//	 if(input.length==0)
//	 {
//	     int str[][] = new int [1][0];
//	     return str;
//	 }
//	 if(input.length==1)
//        {
//            int str[][] = new int[2][];
//            str[0] = new int[0];
//            str[1] = input;
//            return str;
//        }
//        int newInput[] =Arrays.copyOfRange(input, 0, input.length-1);
////      for(int i=0;i<input.length-1;++i)
////        newInput[i] = input[i];
//        int smallAns [][] = subsets(newInput);
//        int ans [][] = new int[smallAns.length*2][];
//                    for(int i=0;i<smallAns.length;++i)  //This for loop copies the small Answer
//            {   ans[i] = new int [smallAns[i].length];
//            ans[i] = Arrays.copyOf(smallAns[i], smallAns[i].length);   
//            }
//            
//            int j;
//            for(int i=0;i<smallAns.length;++i)
//            {   ans[i+smallAns.length] = new int[smallAns[i].length+1];
//                
//            for(j=0;j<smallAns[i].length;++j)
//                {ans[i+smallAns.length][j] = smallAns[i][j];}
//                ans[i+smallAns.length][j] = input[input.length-1];
//            }
//            return ans;
//	}
//	
//	public static String[] subseq(String s){
//		if(s.length()==0){
//			String []str=new String[1];
//			str[0]="";
//			return str;
//		}
//		String []sans=subseq(s.substring(1));
//		String []ans=new String[sans.length*2];
//		for(int i=0;i<sans.length;i++){
//			ans[i]=sans[i];
//		}for(int i=0;i<sans.length;i++){
//			ans[i+sans.length]=s.charAt(0)+sans[i];
//		}
//		return ans;
//	}

	public static void print(int a[][])
	{
		for(int i = 0; i <a.length; i++)
		{
			for(int j = 0; j <a[i].length; j++)
			{
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
