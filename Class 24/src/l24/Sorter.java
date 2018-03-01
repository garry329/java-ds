package l24;

import l24.Vehicle;


public class Sorter {

	public static<T extends CompareInterface<T>> void sort(T a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j - 1].compare(a[j]) == -1) {
					T temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Vehicle a[] = new Vehicle[10];
		for (int i = 0; i < 10; i++) {
			a[i] = new Vehicle();
			a[i].numWheels =  10 - i + 1;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(a[i].numWheels);
		}
		sort(a);
		for (int i = 0; i < 10; i++) {
			System.out.println(a[i].numWheels);
		}
	}
}
