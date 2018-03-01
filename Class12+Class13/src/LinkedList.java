
public class LinkedList {
Node head;
Node tail;
int length;

public int size(){
	return length;
}

public void addatf(int data){
if(head==null&&tail==null){
	Node newNode=new Node(data);
	head=newNode;
	head.next=null;
}
	Node newNode=new Node(data);
newNode.next=head;
head=newNode;
}
public void addate(int data){
	if(head==null&&tail==null)
	{
		Node newNode=new Node(data);
		head=newNode;
		tail=newNode;
		tail.next=null;
	}
	else{
	Node newNode=new Node(data);
	tail.next=newNode;
	newNode.next=null;
	tail = newNode;
	}
}
public void insert(int data,int i){
	 
}
public void removefirst(){
	
}
public void removelast(){
	
}
public void delete(int i){}
public void reverse(){}
public void print(){
	while(head!=null){
		System.out.print(head.data+"-->");
		head=head.next;
	}
}
}
