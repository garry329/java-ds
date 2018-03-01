
public class QueueUse {
public static void main(String[] args) throws QueueEmptyException, QueueFullException {
	QueueA q1=new QueueA(3);
	q1.enqueue(2);
	q1.enqueue(1);
	q1.enqueue(3);
	q1.dequeue();
	q1.enqueue(4);
	q1.print();

}
public static void reverseq(Queue<Integer> q1) throws QueueEmptyException{
	if(q1.size()==1){
		return;
	}
	int d=q1.dequeue();
	reverseq(q1);
	q1.enqueue(d);	
}
}
