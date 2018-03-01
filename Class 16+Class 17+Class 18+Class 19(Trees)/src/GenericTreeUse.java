
import java.util.Scanner;

public class GenericTreeUse {

	public static int numNodes(GenericTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		
		int count = 1;
		for (int i = 0; i < root.children.size(); i++) {
			count += numNodes(root.children.get(i));
		
		}
		return count;
	}
	
	public static boolean checkIdentical(GenericTreeNode<Integer> root1, GenericTreeNode<Integer> root2){
		if(root1==null&&root2==null){return true;}
		if(root1==null||root2==null){return false;}
		if(root1.data==root2.data&&root1.children.size()==root2.children.size()){
			for(int j=0;j<root1.children.size();j++){
				if(root1.children.get(j).data==root2.children.get(j).data){
					return true;
				}			       
				}		    
		}
		for(int i=0;i<root1.children.size();i++){
 checkIdentical(root1.children.get(i), root2.children.get(i));			
		}

				return false;
			
			}
	public static int height(GenericTreeNode<Integer> root){
	    if(root==null){
	        return 0;
	    }
	    if(root.children.size()==0){return 1;}
	    int max=-1;
	    for(int i=0;i<root.children.size();i++){
	        int h=height(root.children.get(i));
	        if(h>max)max=h;
	    }
	    return max+1;
	}
	// 1 3 2 3 6 0 7 0 8 0 3 0 4 2 9 0 20 0
	public static int max(GenericTreeNode<Integer> root){
		if(root==null){
			return 0;
		}
		int max=root.data;
		for(int i=0;i<root.children.size();i++){
			int m=max(root.children.get(i));
			int n=root.children.get(i).data;
			if(m>n){
				max=m;
			}
			else max=n;
		}
		return (int)Math.max(root.data,max);
	}
	public static GenericTreeNode<Integer> takeInput(Scanner s) {
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		GenericTreeNode<Integer> root = new GenericTreeNode<>(rootData);
		System.out.println("Enter num children for " + rootData);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			GenericTreeNode<Integer> nextChild = takeInput(s);
			root.children.add(nextChild);
		}
		return root;
	}
	public static int maximum(GenericTreeNode<Integer> root)
	{
		if(root==null)return Integer.MIN_VALUE;
		int max = root.data,max2=0;
		for(int i = 0;i<root.children.size();i++){
			max2 = root.children.get(i).data;
			max2 = Math.max(max2,maximum(root.children.get(i)) );
		}
		max = Math.max(max, max2);
		return max;
	}
	public static void print(GenericTreeNode<Integer> root) {
		System.out.print(root.data + ":");
		for (int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data + ",");
		}
		System.out.println();
		
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	public static boolean search(GenericTreeNode<Integer>root,int num){
		if(root==null){return false;}
		if(root.data==num){return true;}
		else{for(int i=0;i<root.children.size();i++){
			if(root.children.get(i).data==num){return true;}
		}
		for(int j=0;j<root.children.size();j++){
			search(root.children.get(j),num);
		}}
		return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		GenericTreeNode<Integer> root = takeInput(s);
		int d =maximum(root);
		System.out.println(d);
	}

}
