import java.util.*;
public class PriorityQ {

	public static void main(String[] args) {
	int input[]={8,9,12,45,67,1,2};
	sortAlmostSorted(input,2);
}
public static int[] giveKsmallest(int []input,int k){
	PriorityQueue<Integer> p=new PriorityQueue<>();
	for(int i=0;i<input.length;i++){
		p.add(input[i]);
	}
	int a[]=new int[k];
	for(int i=0;i<k;i++){
		a[i]=p.remove();
	}
	return a;
}

public static void sortAlmostSorted(int a[],int k){
		PriorityQueue<Integer> p=new PriorityQueue<>();
		
		for(int i=0;i<k+1;i++){
			p.add(a[i]);
		}
		for(int i=k+1;i<a.length;i++){
			if(a[i]>p.peek()){
				System.out.println(p.remove());
			p.add(a[i]);
			}
			else
			{
				System.out.println(a[i]);	
			    
			}
		}
}
public static int[] giveKmax(int []input,int k){
	PriorityQueue<Integer> p=new PriorityQueue<>();
	for(int i=0;i<k;i++){
		p.add(input[i]);
	}
	for(int i=k;i<input.length;i++){
		if(input[i]>p.peek()){
			p.remove();
			p.add(input[i]);
		}
	}
	int a[]=new int[k];
	for(int i=0;i<k;i++){
		a[i]=p.remove();
	}
	return a;
}
}
