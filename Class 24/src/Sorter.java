
public  class Sorter  {
public static<T extends CompareInterface<T>> void sortanyarr(T a[]){
	for(int i=0;i<a.length;i++){
		for(int j=1;j<a.length;j++){
			if(a[j-1].compare(a[j])==-1){
				T temp =a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			}
		}
	}
	
}
public static void main(String[] args) {
	Vehicle a[]=new Vehicle[10];
	
	for(int i=0;i<10;i++){
		a[i]=new Vehicle(10-i);
	}
	sortanyarr(a);
	for(int i=0;i<a.length;i++){
		System.out.println(a[i].numWheels);
	}
}
}
