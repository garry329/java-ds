package l24;

public class Vehicle implements CompareInterface<Vehicle>{
	
	protected int numWheels;
	

	
	public  void print() {
		
	}



	@Override
	public int compare(Vehicle second) {
		if (this.numWheels == second.numWheels) {
			return 0;
		} else if (this.numWheels > second.numWheels) {
			return -1;
		} else {
			return 1;
		}
	}



	
}
