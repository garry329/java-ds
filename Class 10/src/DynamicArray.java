
public class DynamicArray {
	int []data=new int[5];
	int next;
	public DynamicArray(){
	int []data=new int[5];
}
public void  add(int element){
	if(next==data.length){
		restructure();
	}
	data[next]=element;
	next++;
}
private void restructure(){
	int temp[]=data;
	data=new int[data.length*2];
	for(int i=0;i<temp.length;i++){
		data[i]=temp[i];
	}
}
public boolean isEmpty(){
	if(size()==0){
		return true;
	}
	else{
		return false; 
	}
}
public int size(){
	return next;
}
public int removeLast(){
	int value=data[next-1];
	next--;
	return value;
}

}
