
public class Stackl<T> {
//THIS IS STACK USING LINKED LIST......
//THIS IS STACK USING LINKED LIST......
//THIS IS STACK USING LINKED LIST......
//THIS IS STACK USING LINKED LIST......
	
	Node<T> top;
	int length=0;
	public Boolean isEmpty(){
		return size()==0;
	}

	public  void push(T data){
		if(top==null){
			Node<T> newNode=new Node<T>(data);
			top=newNode;
			top.next=null;
			length++;
		}
		else{
			Node<T> newNode=new Node<T>(data);
			newNode.next=top;
			top=newNode;
			length++;
		}
	}
	
	
	public T pop() throws StackEmptyException{
		if(length == 0)
		{
			throw new StackEmptyException("Empty hai");	
		}else{
			Node<T> pop=top;
			top=top.next;
			length--;
			return pop.data;
		}}
	public  T topelement() throws StackEmptyException{
		if(length == 0){
			throw new StackEmptyException("empty hai");
		}
		return top.data;
	}
	public  int size(){
		return length;
	}

	public  void print(){
		Node<T> temp = top;
		while(temp!=null){

			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.print("null");
		System.out.println();
	}	
}
