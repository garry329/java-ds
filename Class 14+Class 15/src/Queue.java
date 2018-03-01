
public class Queue<T> {
private Node<T> head;
 private Node<T> tail;
private int length;
public void enqueue(T data){
	if(head==null&&tail==null){
		Node<T> newNode=new Node<T>(data);
        tail=newNode;
        head=newNode;
        head.next=null;
        length=1;
	}
	else{Node<T> newNode=new Node<T>(data);
	tail.next=newNode;
	tail=newNode;
	length++;
	}
}
public T dequeue() throws QueueEmptyException{
	if(head==null&&tail==null){
		throw new QueueEmptyException("queue empty hai");
	}
		Node<T> temp=head;
		head=head.next;
		length--;
       return temp.data;	
	
}
public int size(){
	return length;
}
public boolean isEmpty(){
	return size()==0;
}
public  void print(){
	Node<T> temp = head;
	while(temp!=null){

		System.out.print(temp.data+"-->");
		temp=temp.next;
	}
	System.out.print("null");
	System.out.println();
}
}
