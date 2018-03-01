import java.util.*;
public class NodeUse { 
	public static Node evenodd(Node head){
		Node start=head;
		int i=0;
		while(start!=null){
			if(start.data%2==0){
			head=taketoend(head, i);
				int c=0;
				start =head;
				while(start!=null&&c!=i){
					c++;
					start=start.next;
					
				}
				
//				start=start.next;

//				if(start.next!=null&&start.next.data%2!=0){
				
				//}
				
				i++;
			}
			else 
			{i++;
			start=start.next;
			}
			
		}
		return head;
	}
	public static Node oddEvenList(Node head) {
    Node even=null;
    Node odd=null;
    Node start=head;
    while(start!=null){
    	if(start.data%2==0){
    		even=insertatend(even, start.data);
    		start=start.next;
    	}
    	else{
    		odd=insertatend(odd, start.data);
    		start=start.next;
    	}
    }
    Node ans=merge2(odd,even);
    return ans;
    }
	public static Node taketoend(Node head,int i){
		if(i>=len(head)){
			return head;
		}
		Node prev=head;
		Node ne=head;
		
		int c=0;
		
		while(ne!=null&&c!=i){
			c++;
			prev=ne;
			ne=ne.next;
		}
		Node tail=head;
		while(tail.next!=null){
			tail=tail.next;
		}
		tail.next=ne;
				prev.next=ne.next;
				ne.next=null;
				return head;
	}
	public static Node takeInput(){
		Node head=null;
		Scanner s=new Scanner(System.in);
		int nextData=s.nextInt();
		while(nextData!=-1){
			Node nextNode=new Node(nextData);
			if(head==null){
				head=nextNode;
			}else{Node tail=head;
			while(tail.next!=null){
				tail=tail.next;}
			tail.next=nextNode;	}
			nextData=s.nextInt();
		}
		return head;
	}
	public static void print(Node head){
		while(head!=null){
			System.out.print(head.data+"-->");
			head=head.next;
		}}
	public static int len(Node head){
		int i=0;
		while(head!=null){
			i++;
			head=head.next;
		}	
		return i;
	}
	public static void printi(Node head,int i){
		int c=1;
		while(c!=i&&head!=null){
			c++;
			head=head.next;
		}
		System.out.println(head.data);
	}
	public static Node insertr(Node head,int i,int data){
		if(head==null&&i>0){return head;}
		if(i==0){
			Node newNode =new Node(data);
			newNode.next=head;
			head =newNode;
			return head;
		}
		Node newNode=insertr(head.next,i-1,data);
		head.next=newNode;
		return head;
	}
	public static Node mid(Node head)
	{
		Node fast=head;
		Node slow=head;
		while(fast.next!=null&&fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public static Node delr(Node head,int i){
		if(head==null&&i>0){return head;}
		if(i==0){
			head=head.next;
			return head;
		}
		Node newNode=	delr(head.next,i-1);
		head.next=newNode;
		return head;	
	}
	public static Node dup(Node head)
	{

		Node prev=head;
		Node ne=head;
		while(ne!=null)
		{
			if( prev.data==ne.data){
				prev.next=ne.next;
				ne=ne.next;
			}
			else{
				prev=prev.next;
				ne=ne.next;
			}  }  	  
		return head;      
	}
	public static DoubleNODE reverse2(Node head){
		if(head==null||head.next==null){
			DoubleNODE o=new DoubleNODE(head, head);
			return o;}
		DoubleNODE o=reverse2(head.next);
		o.tail.next=head;
		head.next=null;
		o.tail=head;
		return o;
	}
	public static Node inserti(Node head,int i,int data){
		int c=0;
		Node newNode=new Node(data);
		Node prev=head;
		Node ne=head;
		if(i>len(head)){
			return head;
		}
		if(i==0){
			newNode.next=head;
			head=newNode;
		}		
		else{
			while(c!=i&&prev!=null){
				c++;
				prev=ne;
				ne=ne.next;
			}
			prev.next=newNode;
			newNode.next=ne;
		}
		return head;}
public static Node insertatend(Node head,int data){
	if(head==null){
		Node newNode=new Node(data);
		head=newNode;
		head.next=null;
		return head;
	}
	Node tail=head;
	while(tail.next!=null){
		tail=tail.next;
	}
	Node newNode=new Node(data);
    tail.next=newNode;
    newNode.next=null;
    return head;
	
}	
public static Node deli(Node head,int i){
		int c=1;
		Node prev=head;
		Node ne=head;
		if(i>len(head)){
			System.out.println("drink up");
		}
		else if(i==1){
			head=head.next;
		}
		else{
			while(c!=i&&prev!=null){
				c++;
				prev=ne;
				ne=ne.next;
			}
			prev.next=ne.next;}
		return head;
	}
	public static Node reverse1(Node head){
		if(head==null||head.next==null){
			return head;
		}
		Node smallHead=reverse1(head.next);
		Node c=smallHead;
		while(c.next!=null){
			c=c.next;
		}
		c.next=head;
		head.next=null;
		return smallHead;
	}
	public static Node reverse3(Node head){
		if(head==null||head.next==null){
			return head;
		}
		// c is smalltail
		Node smallHead=reverse3(head.next);
		Node c=head.next;
		c.next=head;
		head.next=null;
		return smallHead;
	}
	public static Node appendn(Node head,int k){
		Node newhead=reverse4(head);
		Node start=newhead;
		Node startn=newhead;
		Node tail=newhead;
		int c=1;
		while( tail!=null&&c!=k){
			c++;
			tail=tail.next;	
		}
		start=tail.next;
		tail.next=null;
		Node sans1=reverse4(startn);
		Node sans2=reverse4(start);
		Node ans=merge2(sans1,sans2);
		return ans;
						
	} 
	public static Node reverse4(Node head){
		Node prev=null;
		Node current=head;
		while(current!=null){
			Node temp=current.next;
			current.next=prev;
			prev=current;
			current =temp;
		}
		return prev;
	}
	public static Node mg(Node head){

		if(head==null||head.next==null){
			return head;
		}
		Node head2=mid(head).next;
		mid(head).next=null;

		return merge(mg(head),mg(head2));

	}
	public static Node kReverse(Node head, int k) {
		Node ans=null;
		Node sans=null;
		if(k>=len(head)){
			return reverse4(head);
		}
		else{
			int c=1;
			Node start =head;
			while(start!=null){
				c=1;
				Node startnext=start;
				Node tail=start;				
				while( tail!=null&&c!=k)
				{
					c++;
					tail=tail.next;	
				}
				if(tail==null)
				{
					sans=reverse4(startnext);
					ans=merge2(ans,sans);
					return ans;
				}
				if(tail!=null)
				{					
					start=tail.next;
					tail.next=null;
					 sans=reverse4(startnext);
					 ans=merge2(ans,sans);	 
				}  				
				
				}	    
			return ans;}}
	public static Node merge2(Node head1,Node head2){
		if (head1 == null) return head2;
		if (head2 == null) return head1;
		Node start =head1;
		while(start.next!=null){
			start=start.next;
		}
		start.next=head2;
		return head1;
	}
    public static Node merge(Node head1, Node head2) {
		if (head1 == null) return head2;
		if (head2 == null) return head1;

		if (head1.data < head2.data) {
			head1.next = merge(head1.next, head2);
			return head1;
		} else {
			head2.next = merge(head2.next, head1);
			return head2;
		}
	}
	public static void main(String[] args) {
		Node x=takeInput();
		print(kReverse(x,3));
		//	System.out.println(len(x));
		//	printi(x,2);
		//	Node y=insertr(x,3,6);
		//	print(y);

		//System.out.println();
		//	Node z=delr(x,4);
		//print(z);
		//System.out.println(mid(x));
		//	Node y=inserti(x,1,5);
		//print(deli(x,2));
		//System.out.println();
		//print(deli(y,3));
	}
}
