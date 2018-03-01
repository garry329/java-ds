
public class Complex {
int a;
int b;
Complex(int a,int b){
	this.a=a;
	this.b=b;}
public void print(){
	System.out.println(this.a+"+i"+this.b);
}
public static Complex add(Complex c1,Complex c2){
	Complex c3= new Complex(c1.a+c2.a,c1.b+c2.b);
return c3;
}
public static Complex mul(Complex c1,Complex c2){
	Complex c3=new Complex(c1.a*c2.a-c1.b*c2.b,c1.a*c2.b+c1.b*c2.a);
return c3;
}
}
