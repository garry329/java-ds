
public class Vehicle implements CompareInterface<Vehicle> {
 public int numWheels;
 public Vehicle (int numWheels){
	 this.numWheels=numWheels;
 }
public int compare(Vehicle v){
if(this.numWheels==v.numWheels){return 0;}
if(this.numWheels>v.numWheels){return -1;}
else{return 1;}
}

}
