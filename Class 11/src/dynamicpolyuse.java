
public class dynamicpolyuse {
	public static void main(String[] args) {
		dynamicpoly p1=new dynamicpoly();
		p1.setcoeff(5, 1);
		p1.setcoeff(7, 8);
		p1.print();
		dynamicpoly p2=new dynamicpoly();
		p2.setcoeff(2,1);
		p2.setcoeff(3, 5);
		p2.print();
	p2.addp(p1);	
	}
}
