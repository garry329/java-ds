
public class dyna {
	int []data=new int[5];
	int next;
	public dyna(){
	int []data=new int[5];
}
public void  add(int element){
	if(next==data.length){
		restructure();
	}
	data[next]=element;
	next++;
}
public int get(int index) {
	if (index >= next) {
		// error out
		return -1;
	}
	return data[index];
}

public void set(int element, int index) {
	if (index > next) {
		return;
	}
	if (index < next) {
		data[index] = element;
	} else {
		add(element);
	}
	
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
