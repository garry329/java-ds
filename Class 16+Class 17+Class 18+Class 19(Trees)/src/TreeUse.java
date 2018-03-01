import java.util.*;

public class TreeUse {
	// arrays are 1 2 4 5 3 6 7
	// 4 2 5 1 6 3 7
	// 1 2 3 4 -1 5 -1 6 -1 -1 -1 -1 -1
	// 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
	// 1 2 3 4 9 5 10 6 -1 -1 -1 7 -1 -1 -1 -1 -1 -1 -1
	public static void main(String[] args) {
		// System.out.println(bigsum2(takeTreeInputLevelWise()).first);
		// TreeNode<Integer> head=bstToDll(takeTreeInputLevelWise());
		// while(head!=null){
		// System.out.println(head.data);
		// head=head.right;
		// }
//		
//		int a[] = { 10, 5, 4, 6, 15, 30, 20 };
//		printlevel(bstfrompreorder(a, 0, a.length - 1));
		// System.out.println(noofbst(4));
//		System.out.println(checkleaf(takeTreeInputLevelWise(),2));
//	printlevel(replaceWithLargerNodesSum(takeTreeInputLevelWise()));
inorder(takeTreeInputLevelWise());
	}
	
	public static void rootToLeafPathsSumToK2(TreeNode<Integer> root, int k) {
	    ArrayList<Integer> a= inorderRecursive(root);
	    for(int i=0;i<a.size();i++){
	        if(checkleaf(root,a.get(i))){
	    ArrayList<Integer> p=printances(root,a.get(i));
	    int sum=0;
	    for(int j=0;j<p.size();j++)
	        {
	           sum+=p.get(j); 
	        }
	        if(sum==k){
	         for(int j=p.size()-1;j>=0;j--)
	        {
	           System.out.print(p.get(j)+" "); 
	        }
	        System.out.println();
	        }
	            
	        }
	    }
	    return;
}

	public static TreeNode<Integer> replaceWithLargerNodesSum(TreeNode<Integer> root) {
if(root==null){return null;}
if(root.left==null&&root.right==null){
    return root;
}
if(root.left!=null&&root.right==null){
    root.left.data+=root.data;
	return root;
}
if(root.left==null&&root.right!=null){
    root.data+=root.right.data;
	return root;
}
TreeNode<Integer> head=root;
int c=0;

if(root.right!=null)
 c=sum(root.right);
int d=root.data;

root.data+=c;

//if(root.left!=null&&root.left.left!=null){
//	root.left.data+=d+root.left.left.data+c;
//}
//if(root.left!=null&&root.left.left==null){
//	root.left.data+=d+c;
//}
//if(root.right!=null&&root.right.right!=null){
//	root.right.data+=root.right.right.data;
//}
//if(root.left!=null&&root.left.left!=null){
//    replaceWithLargerNodesSum(root.left.left);
//}
//if(root.left!=null&&root.left.right!=null){
//    replaceWithLargerNodesSum(root.left.right);
//}
//
//if(root.right!=null&&root.right.left!=null){
//    replaceWithLargerNodesSum(root.right.left);
//}
//
//if(root.right!=null&&root.right.right!=null){
//    replaceWithLargerNodesSum(root.right.right);
//}

return head;
	}
	public static int sum(TreeNode<Integer> root){
	    ArrayList<Integer> a=inorderRecursive(root);
	    int s=0;
	    for(int i=0;i<a.size();i++){
	        s+=a.get(i);
	    }
	    return s;
	}
public static ArrayList<Integer> a = new ArrayList<Integer>();
public static ArrayList<Integer> inorderRecursive(TreeNode<Integer> root){
	if (root == null){
		return null;
	}else{
		inorderRecursive(root.left);
		a.add(root.data);
		inorderRecursive(root.right);
	}
	return a;
}
	public static Boolean checkleaf(TreeNode<Integer> root,int data){
		if(root==null){return false;}
	if(root.left==null&&root.right==null&&root.data==data){return true;}
	if(checkleaf(root.left, data)){
		return true;
	}
	if(checkleaf(root.right, data)){
		return true;
	}
	return false;
	}
	public static TreeNode<Integer> bstToDll(TreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		TreeNode<Integer> ls = bstToDll(root.left);
		TreeNode<Integer> p = ls;
		if (ls == null)
			ls = root;
		else {
			while (p.right != null) {
				p = p.right;
			}
			p.right = root;
		}
		TreeNode<Integer> rs = bstToDll(root.right);
		root.right = rs;
		return ls;
	}

	public static Node<Integer> bstll(TreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		Node<Integer> left = bstll(root.left);
		Node<Integer> right = bstll(root.right);
		Node<Integer> mid = new Node<Integer>(root.data);
		Node<Integer> head = left;
		while (left.next != null)
			left = left.next;
		left.next = mid;
		mid.next = right;
		while (right.data != max(root)) {
			right = right.next;
		}
		right.next = null;
		return head;
	}

	public static TreeNode<Integer> bstfrompreorder(int[] preOrder, int preStart, int preEnd) {
		if (preStart > preEnd) {
			return null;
		}
		if (preEnd-preStart==0) {
			return new TreeNode<Integer>(preOrder[preStart]);
		}
		int i = preStart + 1;
		TreeNode<Integer> root = new TreeNode<Integer>(preOrder[preStart]);
		while (i <= preEnd && preOrder[i] < root.data) {
			i++;
		}
		root.left = bstfrompreorder(preOrder, preStart + 1, i-1);
		root.right = bstfrompreorder(preOrder, i, preEnd);
		return root;
	}

	public static int noofbst(int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = ans + noofbst(i) * noofbst(n - i - 1);
		}
		return ans;
	}

	public static int i = 0;

	public static TreeNode<Integer> bstfrompreorder2(int[] pre, int min, int max) {
		if (i >= pre.length)
			return null;
		if (pre[i] > max || pre[i] < min) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<>(pre[i]);
		i++;
		root.left = bstfrompreorder2(pre, min, root.data - 1);
		root.right = bstfrompreorder2(pre, root.data + 1, max);

		return root;
	}

	public static int bigsum(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return root.data;
		}
		int sum1 = root.data + bigsum(root.left.left) + bigsum(root.left.right) + bigsum(root.right.left)
				+ bigsum(root.right.right);
		int sum2 = bigsum(root.left) + bigsum(root.right);
		return Math.max(sum1, sum2);
	}

	public static pair<Integer, Integer> bigsum2(TreeNode<Integer> root) {
		if (root == null) {
			return new pair<>(0, 0);
		}
		// if(root.left==null&&root.right==null){
		// return new pair<>(root.data,root.data);
		// }
		pair<Integer, Integer> pl = bigsum2(root.left);
		pair<Integer, Integer> pr = bigsum2(root.right);
		return new pair<>(root.data + pl.second + pr.second,
				Math.max(pl.first, pl.second) + Math.max(pr.first, pr.second));
	}

	public static void leftview(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		QueueUsingLL<TreeNode<Integer>> l1 = new QueueUsingLL<TreeNode<Integer>>();
		QueueUsingLL<TreeNode<Integer>> l2 = new QueueUsingLL<TreeNode<Integer>>();
		l1.enqueue(root);
		System.out.println(root.data);
		while (!l1.isEmpty()) {

			try {
				TreeNode<Integer> first = l1.dqueue();
				if (first.left != null) {
					l2.enqueue(first.left);
				}
				if (first.right != null) {
					l2.enqueue(first.right);
				}

			} catch (QueueEmptyException e) {
				return;
			}
			if (l1.isEmpty()) {
				if (!l2.isEmpty()) {
					try {
						System.out.println(l2.front().data);
					} catch (QueueEmptyException e) {

						return;
					}
				}
				QueueUsingLL<TreeNode<Integer>> temp = l1;
				l1 = l2;
				l2 = temp;
			}
		}
	}

	public static void rootToLeafPathsSumToK(TreeNode<Integer> root, int k) {
		Stack<TreeNode<Integer>> s = new Stack<>();
		while (true) {
			// Go to the left extreme insert all the elements to stack
			while (root != null) {
				s.push(root);
				root = root.left;
			}
			// check if Stack is empty, if yes, exit from everywhere
			if (s.isEmpty()) {
				return;
			}
			// pop the element from the stack , print it and add the nodes at
			// the right to the Stack
			root = s.pop();
			if (root.left == null && root.right == null) {
				ArrayList<Integer> a = printances(root, root.data);
				int sum = 0;
				for (int i = 0; i < a.size(); i++) {
					sum += a.get(i);
				}

				for (int i = 0; i < a.size(); i++) {
					System.out.print(a.get(i) + " ");
				}
				System.out.println();

				return;
			}
			root = root.right;
		}
	}

	public static TreeNode<Integer> lcaInBst(TreeNode<Integer> root, int data1, int data2) {
		if (root.data < Math.max(data1, data2) && root.data > Math.min(data1, data2)) {
			return root;
		}
		if (root.data < data1 && root.data < data2) {
			return lcaInBst(root.right, data1, data2);
		} else {
			return lcaInBst(root.left, data1, data2);
		}
	}

	public static TreeNode<Integer> buildbst(int a[], int start, int end) {
		if (end - start == 1) {
			TreeNode<Integer> root = new TreeNode<Integer>(a[start]);
			return root;
		}
		int mid = (start + end) / 2;
		TreeNode<Integer> root = new TreeNode<Integer>(a[mid]);
		root.left = buildbst(a, start, mid);
		root.right = buildbst(a, mid + 1, end);
		return root;

	}

	public static Triplet<Boolean, Integer, Integer> isBst2(TreeNode<Integer> root) {
		if (root == null) {
			return new Triplet<Boolean, Integer, Integer>(true, Integer.MAX_VALUE, Integer.MIN_VALUE);
		}
		if (root.left == null && root.right == null) {
			return new Triplet<Boolean, Integer, Integer>(true, root.data, root.data);
		}
		Triplet<Boolean, Integer, Integer> left = isBst2(root.left);
		Triplet<Boolean, Integer, Integer> right = isBst2(root.right);
		// int min=(int)Math.min(root.data,Math.min(left.second, right.second));
		// int max=(int)Math.max(root.data,Math.max(left.third, right.third));

		// if(!left.first||!right.first) return new Triplet<Boolean, Integer,
		// Integer>(false,left.third,right.second);
		if (left.third < root.data && right.second >= root.data) {
			if (left.first && right.first)
				return new Triplet<Boolean, Integer, Integer>(true, left.third, right.second);
		}
		return new Triplet<Boolean, Integer, Integer>(false, left.third, right.second);
	}

	public static Boolean isBst(TreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		if (root.left == null && root.right != null) {
			if (root.right.data >= root.data)
				return true;
			else
				return false;
		}
		if (root.left != null && root.right == null) {
			if (root.left.data < root.data)
				return true;
			else
				return false;
		}
		if (root.left == null && root.right == null) {
			return true;
		}
		if (max(root.left) < root.data && min(root.right) >= root.data) {
			if (isBst(root.left) && isBst(root.right)) {
				return true;
			}
		}
		return false;
	}

	public static void printNodesWithoutSibling(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		if (root != null && root.left == null && root.right != null) {
			System.out.println(root.right.data + " ");
			return;
		}
		if (root != null && root.left != null && root.right == null) {
			System.out.println(root.left.data + " ");
			return;

		}
		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
	}

	public static TreeNode<Integer> removeAllLeaves(TreeNode<Integer> root) {

		// Write your code here
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			return null;
		}
		if (root.left != null) {
			if (root.left.left == null && root.left.right == null) {
				root.left = null;
				return root;
			}
		}
		if (root.right != null) {
			if (root.right.left == null && root.right.right == null) {
				root.right = null;
				return root;
			}
		}
		removeAllLeaves(root.left);
		removeAllLeaves(root.right);
		return root;
	}

	public Four<Integer, Integer, TreeNode<Integer>, Integer> largestbst(TreeNode<Integer> root) {
		if (root == null) {
			return new Four<Integer, Integer, TreeNode<Integer>, Integer>(Integer.MAX_VALUE, Integer.MIN_VALUE, null,
					0);
		}
		if (root.left == null && root.right == null) {
			return new Four<Integer, Integer, TreeNode<Integer>, Integer>(root.data, root.data, root, 1);
		}
		Four<Integer, Integer, TreeNode<Integer>, Integer> left = largestbst(root.left);
		Four<Integer, Integer, TreeNode<Integer>, Integer> right = largestbst(root.right);

		if (root.left.data == left.third.data && root.right.data == right.third.data) {
			if (root.data > left.second && root.data <= right.first) {
				return new Four<Integer, Integer, TreeNode<Integer>, Integer>(left.first, right.second, root,
						1 + Math.max(left.fourth, right.fourth));
			} else {
				int h = Math.max(left.fourth, right.fourth);
				if (left.fourth == h) {
					return new Four<Integer, Integer, TreeNode<Integer>, Integer>(left.first, left.second, left.third,
							h);
				}
				if (right.fourth == h) {
					return new Four<Integer, Integer, TreeNode<Integer>, Integer>(right.first, right.second,
							right.third, h);
				}
			}
		} else if (root.left.data == left.third.data) {
			return new Four<Integer, Integer, TreeNode<Integer>, Integer>(left.first, left.second, left.third,
					left.fourth);
		} else if (root.right.data == right.third.data) {
			return new Four<Integer, Integer, TreeNode<Integer>, Integer>(right.first, right.second, right.third,
					right.fourth);
		}
		return new Four<Integer, Integer, TreeNode<Integer>, Integer>(right.first, right.second, right.third,
				right.fourth);

	}

	public static int lowestcommonances(TreeNode<Integer> root, int data1, int data2) {
		ArrayList<Integer> a = printances(root, data1);
		ArrayList<Integer> a2 = printances(root, data2);
		int b = 0;
		for (int i = 0, j = 0; i < a.size() && j < a2.size(); i++, j++) {
			if (a.get(i) == a2.get(j)) {
				b = a.get(i);
				break;
			}
		}
		return b;
	}

	public static void printancestors(TreeNode<Integer> root, int data) {

		if (root == null) {
			return;
		}
		System.out.println(root.data);
		if (search(root.left, data))
			printancestors(root.left, data);
		if (search(root.right, data))
			printancestors(root.right, data);

	}

	public static ArrayList<Integer> printances(TreeNode<Integer> root, int data) {
		if (root == null) {
			return new ArrayList<>();
		}
		if (root.data == data) {
			ArrayList<Integer> a = new ArrayList<>();

			a.add(data);
			return a;
		}
		ArrayList<Integer> a = new ArrayList<>();
		if (search(root.left, data))
			a = printances(root.left, data);
		if (search(root.right, data))
			a = printances(root.right, data);
		a.add(root.data);
		return a;
	}

	public static int diameter(TreeNode<Integer> root) {
		if (root == null)
			return 0;
		int lh = height(root.left);
		int rh = height(root.right);
		int ld = diameter(root.left);
		int rd = diameter(root.right);
		int max1 = (int) Math.max(rh + lh, ld);
		int max = (int) Math.max(max1, rd);
		return max;
	}

	public static void inorder(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		return;
	}

	public static int[] input() {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		return a;
	} 

	public static TreeNode<Integer> findtreefromorders(int[] pre, int[] in, int preStart, int preEnd, int inStart,
			int inEnd) {

		if (inEnd - inStart == 0) {
			return null;
		}

		if (inEnd - inStart == 1) {
			TreeNode<Integer> root = new TreeNode<Integer>(in[inStart]);
			return root;
		}

		int pos = 0;

		TreeNode<Integer> root = new TreeNode<Integer>(pre[preStart]);
		for (int i = inStart; i < inEnd; i++) {
			if (in[i] == root.data) {
				pos = i;
				break;
			}
		}
		root.left = findtreefromorders(pre, in, preStart + 1, pos, inStart, pos);
		root.right = findtreefromorders(pre, in, pos + 1, preEnd, pos + 1, inEnd);

		return root;
	}

	public static TreeNode<Integer> findtreefromorder2(int post[], int[] in, int postStart, int postEnd, int inStart,
			int inEnd) {
		if (postEnd - postStart == 0) {
			return null;
		}
		if (inEnd - inStart == 0) {
			return null;
		}

		if (inEnd - inStart == 1) {
			TreeNode<Integer> root = new TreeNode<Integer>(in[inStart]);
			return root;
		}
		TreeNode<Integer> root = new TreeNode<Integer>(post[postEnd - 1]);
		int pos = 0;
		for (int i = inStart; i < inEnd; i++) {
			if (in[i] == root.data) {
				pos = i;
				break;
			}
		}
		root.left = findtreefromorder2(post, in, postStart, pos, inStart, pos);
		root.right = findtreefromorder2(post, in, pos + 1, postEnd, pos + 1, inEnd);
		return root;

	}

	public static Boolean isBalanced(TreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		if (Math.abs(height(root.left) - height(root.right)) <= 1) {
			if (isBalanced(root.left) == true && isBalanced(root.right) == true) {
				return true;
			}
		}

		return false;
	}

	public static Boolean identical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}

		if (root1.data == root2.data) {
			if (identical(root1.left, root2.left) == true && identical(root1.right, root2.right) == true) {
				return true;
			}
		}
		return false;
	}

	public static TreeNode<Integer> takeTreeInput(Scanner s) {

		int rootdata = s.nextInt();
		if (rootdata == -1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<>(rootdata);
		root.left = takeTreeInput(s);
		root.right = takeTreeInput(s);
		return root;
	}

	public static TreeNode<Integer> takeTreeInputLevelWise() {
		System.out.println("Enter root data");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}

		TreeNode<Integer> root = new TreeNode<>(rootData);
		QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<>();
		queue.enqueue(root);
		while (!queue.isEmpty()) {
			TreeNode<Integer> parent;
			try {
				parent = queue.dqueue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter left child of " + parent.data);
			int leftData = s.nextInt();
			if (leftData != -1) {
				TreeNode<Integer> leftChild = new TreeNode<Integer>(leftData);
				queue.enqueue(leftChild);
				parent.left = leftChild;
			}
			System.out.println("Enter right child of " + parent.data);
			int rightData = s.nextInt();
			if (rightData != -1) {
				TreeNode<Integer> rightChild = new TreeNode<Integer>(rightData);
				queue.enqueue(rightChild);
				parent.right = rightChild;
			}
		}
		return root;
	}

	public static int leaf(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return leaf(root.right) + leaf(root.left);
	}

	public static int height(TreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		int lh = height(root.left);
		int lr = height(root.right);
		int max1 = (int) Math.max(lh, lr);
		return max1 + 1;
	}

	public static int max(TreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		if (root.left == null && root.right == null) {
			return root.data;
		}
		int lmax = max(root.left);
		int rmax = max(root.right);
		int max1 = (int) Math.max(lmax, rmax);
		return (int) Math.max(max1, root.data);
	}

	public static int min(TreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		if (root.left == null && root.right == null) {
			return root.data;
		}
		int lmax = min(root.left);
		int rmax = min(root.right);
		int max1 = (int) Math.min(lmax, rmax);
		return (int) Math.min(max1, root.data);
	}

	public static Boolean search(TreeNode<Integer> root, int s) {
		if (root == null) {
			return false;
		}
		if (root.data == s) {
			return true;
		}
		if (search(root.left, s) == true) {
			return true;
		}
		if (search(root.right, s) == true) {
			return true;
		}
		return false;
	}

	public static void print(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print(root.left.data + ",");
		}
		if (root.right != null) {
			System.out.print(root.right.data + ",");
		}
		System.out.println();
		print(root.left);
		print(root.right);
	}

	public static void printlevel(TreeNode<Integer> root) {
		
		for (int i = 0; i < height(root); i++) {
			printlevelk(root, i);
			System.out.println();
		}
	}

	public static TreeNode<Integer> maxSum(TreeNode<Integer> root) {
		if (root.left == null && root.right == null)
			return root;

		int rs = root.data + root.left.data + root.right.data;
		TreeNode<Integer> l = maxSum(root.left);
		int ls = l.data;
		if (l.left != null) {
			ls = l.left.data + ls;
		}
		if (l.right != null) {
			ls = l.right.data + ls;
		}
		TreeNode<Integer> r = maxSum(root.right);

		int ris = r.data;
		if (r.left != null) {
			ris = r.left.data + ris;
		}
		if (r.right != null) {
			ris = r.right.data + ris;
		}
		int max1 = (int) Math.max(ls, ris);
		int max = (int) Math.max(max1, rs);
		if (max == ls) {
			return l;
		} else if (max == ris) {
			return r;
		} else {
			return root;
		}
	}

	public static void printlevelk(TreeNode<Integer> root, int k) {
		if (root == null) {
			return;
		}
		if (k == 0) {
			System.out.print(root.data+" ");
		}
		printlevelk(root.left, k - 1);
		printlevelk(root.right, k - 1);
	}
}
