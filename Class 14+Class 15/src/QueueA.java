
public class QueueA {
private int data[];
private int nextIndex;
private int firstIndex;
private int size;
public QueueA(int max){
	data=new int[max];
	max=0;
	size=0;
	firstIndex=-1;
}
public int size(){
	return size;
}
public Boolean isEmpty(){
	return size()==0;
}
public void enqueue(int element) throws QueueFullException {
	if(size==data.length){
		QueueFullException e =new QueueFullException();
		throw e;
	}
	data[nextIndex]=element;
	size++;
			if(size==1){
				firstIndex=0;
			}
			nextIndex=(nextIndex+1)%data.length;
}
public int front() throws QueueEmptyException{
	if(size==0){
		QueueEmptyException e =new QueueEmptyException();
		throw e;
	}
	return data[firstIndex];
}
public int dequeue() throws QueueEmptyException{
	if(size==0){
		QueueEmptyException e =new QueueEmptyException();
		throw e;
	}
	int temp=data[firstIndex];
	nextIndex=(nextIndex+1)%data.length;
	size--;
	if(size==1){
		firstIndex=-1;
		nextIndex=0;
	}
	return temp;
}
public void print(){
	for(int i=firstIndex;i<data.length;i++){
		System.out.println(data[i]);
	}
	
}
}
