
public class DynamicArrayUse {
public static void main(String[] args) {
	DynamicArray d=new DynamicArray();
	for(int i=0;i<26;i++){
		d.add(i);
	}
	for(int i=0;i<12;i++){
		System.out.println(d.removeLast());
	}
}
}
