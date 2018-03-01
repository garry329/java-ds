
public class ComplexUse {
public static void main(String[] args) {
	Complex c1=new Complex(2, 3);
	Complex c2=new Complex(2, -3);
	Complex sum=Complex.add(c1,c2);
	Complex m=Complex.mul(c1,c2);
	sum.print();
	m.print();}}
